package com.infect.backend.utils;

import com.infect.backend.model.CityPO;
import com.infect.backend.model.NcovCity;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CityMapper {
    public static CityPO mapToPO (NcovCity.News.City city, LocalDate date) {
        ZonedDateTime zonedDateTime = date.atStartOfDay(ZoneId.systemDefault());

        return CityPO.builder()
                .date(Date.from(zonedDateTime.toInstant()))
                .cityname(city.getCityName())
                .currentconfirmedcount(city.getConfirmedCount())
                .confirmedcount(city.getConfirmedCount())
                .curedcount(city.getCuredCount())
                .deadcount(city.getDeadCount())
                .build();
    }

}
