package com.infect.backend.service;

import com.infect.backend.model.NcovCity;

import java.time.LocalDate;

public interface CityService {
    int insertCity(NcovCity.News.City city, LocalDate date);

    Long countDate(LocalDate date);
}
