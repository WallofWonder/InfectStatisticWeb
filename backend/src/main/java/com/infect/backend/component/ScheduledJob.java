package com.infect.backend.component;

import com.alibaba.fastjson.JSON;
import com.infect.backend.entity.Ncov;
import com.infect.backend.entity.NcovCity;
import com.infect.backend.service.CityService;
import com.infect.backend.service.NationService;
import com.infect.backend.service.ProvinceService;
import com.infect.backend.utils.DataRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
@Slf4j
public class ScheduledJob {

    @Resource(name = "provinceServiceImpl")
    ProvinceService provinceService;

    @Resource(name = "cityServiceImpl")
    CityService cityService;

    @Resource(name = "nationServiceImpl")
    NationService nationService;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * 每10分钟更新一次数据库
     */
    @Scheduled(cron = "0 */10 * * * ? ")
    public void cronJob() {
        log.info("=========================== >> 更新数据库...");
        updateNationData();
        updateProvinceDataToday();
        upadateCityData();
        log.info("=========================== >> 数据库更新完成。");
    }

    /**
     * 每天0点10分更新数据库
     */
    @Scheduled(cron = "0 10 0 * * ? ")
    public void daliyJob() {
        log.info("=========================== >> 更新数据库...");
        updateNationData();
        updateProvinceData();
        upadateCityData();
        log.info("=========================== >> 数据库更新完成。");
    }

    /**
     * 应用启动时更新数据库
     */
    @PostConstruct
    public void updateAtStart() {
        log.info("=========================== >> 更新数据库...");
        updateNationData();
        updateProvinceData();
        upadateCityData();
        log.info("=========================== >> 数据库更新完成。");
    }

    /**
     * 更新近20天省疫情数据
     */
    private void updateProvinceData() {

        log.info("--------------------------- >> 更新各省疫情数据...");
        LocalDate date = LocalDate.now();

        for (int i = 0; i < 21; i++) {
            LocalDate dateFormer = LocalDate.now().minusDays(i);
            if (provinceService.countDate(dateFormer) == 0L) {
                String dateTimeStr = formatter.format(dateFormer);
                String jsonString = DataRequest.request(DataRequest.PROVINCE_AND_CITY_STATISICS,
                        "&date=" + dateTimeStr, i % 3);
                NcovCity ncovCity = JSON.parseObject(jsonString, NcovCity.class);
                for (NcovCity.News p : ncovCity.getNewsList()) {
                    provinceService.insertProvince(p, dateFormer);
                }
                log.info("已获取 " + dateTimeStr + " 数据");
            }
        }
        log.info("--------------------------- >> 各省疫情数据更新完成。");
    }

    /**
     * 更新当前各省数据
     */
    private void updateProvinceDataToday() {
        log.info("--------------------------- >> 更新当前各省疫情数据...");
        LocalDate date = LocalDate.now();
        String dateTimeStr = formatter.format(date);
        String jsonString = DataRequest.request(DataRequest.PROVINCE_AND_CITY_STATISICS,
                "&date=" + dateTimeStr, 0);
        NcovCity ncovCity = JSON.parseObject(jsonString, NcovCity.class);
        for (NcovCity.News p : ncovCity.getNewsList()) {
            provinceService.update(p, date);
        }
        log.info("--------------------------- >> 当前各省疫情数据更新完成。");
    }

    /**
     * 更新当前城市疫情数据
     */
    private void upadateCityData() {
        log.info("--------------------------- >> 更新全国城市疫情数据...");
        LocalDate date = LocalDate.now();

        cityService.truncate();
        String dateTimeStr = formatter.format(date);
        String jsonString = DataRequest.request(DataRequest.PROVINCE_AND_CITY_STATISICS,
                "&date=" + dateTimeStr, 0);
        NcovCity ncovCity = JSON.parseObject(jsonString, NcovCity.class);
        for (NcovCity.News p : ncovCity.getNewsList()) {
            for (NcovCity.News.City city : p.getCities()) {
                cityService.insertCity(city, date, p.getProvinceShortName());
            }
        }
        log.info("已获取 " + dateTimeStr + " 数据");

        log.info("--------------------------- >> 全国城市疫情数据更新完成。");
    }

    /**
     * 更新全国疫情数据
     */
    private void updateNationData() {
        log.info("--------------------------- >> 更新全国疫情数据...");
        LocalDate date = LocalDate.now();
        String dateTimeStr = formatter.format(date);


        String jsonString = DataRequest.request(DataRequest.NATION_STATISICS_AND_NEWS
                , "&date=" + dateTimeStr, 1);
        Ncov ncov = JSON.parseObject(jsonString, Ncov.class);

        date = date.minusDays(1);
        dateTimeStr = formatter.format(date);
        jsonString = DataRequest.request(DataRequest.NATION_STATISICS_AND_NEWS
                , "&date=" + dateTimeStr, 2);
        Ncov ncovFormer = JSON.parseObject(jsonString, Ncov.class);

        nationService.truncate();
        nationService.insert(ncov.getNewsList().get(0).getDesc(), ncovFormer.getNewsList().get(0).getDesc());
        log.info("--------------------------- >> 全国疫情数据更新完成。");
    }


}
