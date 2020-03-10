package com.infect.backend.utils;

import com.infect.backend.model.CityPO;
import com.infect.backend.model.CityVO;
import com.infect.backend.model.NcovCity;
import org.apache.commons.lang3.ArrayUtils;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CityMapper {

    static String[][] cityNames = {
            {"anhui", "安徽"},
            {"beijing", "北京"},
            {"chongqing", "重庆"},
            {"fujian", "福建"},
            {"gansu", "甘肃"},
            {"guangdong", "广东"},
            {"guangxi", "广西"},
            {"guizhou", "贵州"},
            {"hainan", "海南"},
            {"hebei", "河北"},
            {"henan", "河南"},
            {"heilongjiang", "黑龙江"},
            {"hubei", "湖北"},
            {"hunan", "湖南"},
            {"jilin", "吉林"},
            {"jiangsu", "江苏"},
            {"jiangxi", "江西"},
            {"liaoning", "辽宁"},
            {"neimenggu", "内蒙古"},
            {"ningxia", "宁夏"},
            {"qinghai", "青海"},
            {"shangdong", "山东"},
            {"shanxi", "山西"},
            {"shangxi", "陕西"},
            {"shanghai", "上海"},
            {"sichuang", "四川"},
            {"tianjin", "天津"},
            {"xizang", "西藏"},
            {"xinjiang", "新疆"},
            {"yunnan", "云南"},
            {"zhejiang", "浙江"},
            {"xianggang", "香港"},
            {"aomeng", "澳门"},
            {"taiwan", "台湾"}
    };

    public static Map citiesPY = ArrayUtils.toMap(cityNames);

    public static CityPO mapToPO(NcovCity.News.City city, LocalDate date, String provinceShortName) {
        ZonedDateTime zonedDateTime = date.atStartOfDay(ZoneId.systemDefault());

        return CityPO.builder()
                .date(Date.from(zonedDateTime.toInstant()))
                .provinceshortname(provinceShortName)
                .cityname(city.getCityName())
                .currentconfirmedcount(city.getConfirmedCount())
                .confirmedcount(city.getConfirmedCount())
                .curedcount(city.getCuredCount())
                .deadcount(city.getDeadCount())
                .build();
    }

    public static List<CityVO> mapToListVO(List<CityPO> cityPOS) {
        List<CityVO> cityVOS = new ArrayList<>();

        for (CityPO cityPO : cityPOS) {
            cityVOS.add(CityVO.builder()
                    .cityname(cityPO.getCityname())
                    .confirmedcount(cityPO.getConfirmedcount())
                    .currentconfirmedcount(cityPO.getCurrentconfirmedcount())
                    .deadcount(cityPO.getDeadcount())
                    .curedcount(cityPO.getCuredcount())
                    .build());
        }

        return cityVOS;
    }
}
