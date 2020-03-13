package com.infect.backend.utils;

import com.alibaba.fastjson.JSON;
import com.infect.backend.entity.Ncov;
import com.infect.backend.entity.NcovCity;
import com.infect.backend.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataUpdateUtil {

    private static ProvinceService provinceService;
    private static CityService cityService;
    private static NationService nationService;

    @Autowired
    public void setProvinceService(ProvinceServiceImpl provinceService) {
        DataUpdateUtil.provinceService = provinceService;
    }

    @Autowired
    public void setCityService(CityServiceImpl cityService) {
        DataUpdateUtil.cityService = cityService;
    }

    @Autowired
    public void setNationService(NationServiceImpl nationService) {
        DataUpdateUtil.nationService = nationService;
    }

    /**
     * 更新近20天省疫情数据
     */
    public static void updateProvince() {
        System.out.println("更新各省疫情数据...");
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
                System.out.println("已获取 " + dateTimeStr + " 数据");
            }
        }
        System.out.println("各省疫情数据更新完成\n");
    }

    /**
     * 更新当日城市疫情数据
     */
    public static void upadateCity() {
        System.out.println("更新城市疫情数据...");
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
            System.out.println("已获取 " + dateTimeStr + " 数据");
        }
        System.out.println("城市疫情数据更新完成\n");
    }

    /**
     * 更新全国疫情数据
     */
    public static void updateNation() {
        System.out.println("更新全国疫情数据...");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.now();
        String dateTimeStr = formatter.format(date);
        String jsonString = DataRequest.request(DataRequest.NATION_STATISICS_AND_NEWS
                , "&date=" + dateTimeStr,1 );
        Ncov ncov = JSON.parseObject(jsonString, Ncov.class);
        nationService.truncate();
        nationService.insert(ncov.getNewsList().get(0).getDesc());
        System.out.println("全国疫情数据更新完成\n");
    }
}
