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


    /**
     * 每天0点和12点更新数据库
     */
    @Scheduled(cron = "* * 0,12 * * ? ")
    public void cronJob() {
        updateData();
    }

    /**
     * 应用启动时更新数据库
     */
    @PostConstruct
    public void updateAtStart() {
        updateData();
    }

    /**
     * 数据库更新操作
     */
    public void updateData() {
        log.info("=========================== >> 更新数据库...");
        updateNation();
        updateProvince();
        upadateCity();
        log.info("=========================== >> 数据库更新完成。");
    }

    /**
     * 更新近20天省疫情数据
     */
    public void updateProvince() {

        log.info("更新各省疫情数据...");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.now();

        for (int i = 0; i < 20; i++) {
            LocalDate datet = LocalDate.now().minusDays(i);
            if (provinceService.countDate(datet) == 0L) {
                String dateTimeStr = formatter.format(datet);
                String jsonString = DataRequest.request(DataRequest.PROVINCE_AND_CITY_STATISICS,
                        "&date=" + dateTimeStr, i);
                NcovCity ncovCity = JSON.parseObject(jsonString, NcovCity.class);
                for (NcovCity.News p : ncovCity.getNewsList()) {
                    provinceService.insertProvince(p, datet);
                }
                log.info("已获取 " + dateTimeStr + " 数据");
            }
        }
        log.info("各省疫情数据更新完成\n");
    }

    /**
     * 更新当日城市疫情数据
     */
    public void upadateCity() {
        log.info("更新城市疫情数据...");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.now();

        if (cityService.countDate(date) == 0L) {
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
        }
        log.info("城市疫情数据更新完成\n");
    }

    /**
     * 更新全国疫情数据
     */
    public void updateNation() {
        log.info("更新全国疫情数据...");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.now();
        String dateTimeStr = formatter.format(date);
        String jsonString = DataRequest.request(DataRequest.NATION_STATISICS_AND_NEWS
                , "&date=" + dateTimeStr, 1);
        Ncov ncov = JSON.parseObject(jsonString, Ncov.class);
        nationService.truncate();
        nationService.insert(ncov.getNewsList().get(0).getDesc());
        log.info("全国疫情数据更新完成\n");
    }
}
