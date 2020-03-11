package com.infect.backend.service;

import com.infect.backend.model.CityVO;
import com.infect.backend.entity.NcovCity;

import java.time.LocalDate;
import java.util.List;

public interface CityService {
    int insertCity(NcovCity.News.City city, LocalDate date, String provinceName);

    Long countDate(LocalDate date);

    List<CityVO> selectCities(String province);

    void truncate();
}
