package com.infect.backend.component;

import com.alibaba.fastjson.JSON;
import com.infect.backend.entity.Ncov;
import com.infect.backend.entity.NcovCity;
import com.infect.backend.service.CityService;
import com.infect.backend.service.NationService;
import com.infect.backend.service.ProvinceService;
import com.infect.backend.utils.DataRequest;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Resource(name = "provinceServiceImpl")
    ProvinceService provinceService;

    @Resource(name = "cityServiceImpl")
    CityService cityService;

    @Resource(name = "nationServiceImpl")
    NationService nationService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        updateProvince();
        upadateCity();
        updateNation();
    }

    /**
     * 更新近10天省疫情数据
     */
    public void updateProvince() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.now();

        for (int i = 0; i < 10; i++) {
            LocalDate datet = LocalDate.now().minusDays(i);
            if (provinceService.countDate(datet) == 0L) {
                String dateTimeStr = formatter.format(datet);
                String jsonString = DataRequest.request(DataRequest.PROVINCE_AND_CITY_STATISICS, "&date=" + dateTimeStr);
                NcovCity ncovCity = JSON.parseObject(jsonString, NcovCity.class);
                for (NcovCity.News p : ncovCity.getNewsList()) {
                    provinceService.insertProvince(p, datet);
                }
            }
        }
    }

    /**
     * 更新当日城市疫情数据
     */
    public void upadateCity() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.now();

        if (cityService.countDate(date) == 0L) {
            cityService.truncate();
            String dateTimeStr = formatter.format(date);
            String jsonString = DataRequest.request(DataRequest.PROVINCE_AND_CITY_STATISICS, "&date=" + dateTimeStr);
            NcovCity ncovCity = JSON.parseObject(jsonString, NcovCity.class);
            for (NcovCity.News p : ncovCity.getNewsList()) {
                for (NcovCity.News.City city : p.getCities()) {
                    cityService.insertCity(city, date, p.getProvinceShortName());
                }
            }
        }
    }

    /**
     * 更新全国疫情数据
     */
    public void updateNation() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.now();
        String dateTimeStr = formatter.format(date);
        String jsonString = DataRequest.request(DataRequest.NATION_STATISICS_AND_NEWS, "&date=" + dateTimeStr);
        Ncov ncov = JSON.parseObject(jsonString, Ncov.class);
        nationService.truncate();
        nationService.insert(ncov.getNewsList().get(0).getDesc());
    }
}
