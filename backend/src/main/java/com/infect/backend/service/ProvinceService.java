package com.infect.backend.service;

import com.infect.backend.model.ProvinceMapVO;
import com.infect.backend.entity.NcovCity;
import com.infect.backend.model.ProvinceVO;

import java.time.LocalDate;

public interface ProvinceService {

    int insertProvince(NcovCity.News province, LocalDate date);

    ProvinceMapVO getNationalProvince(LocalDate date, String type);

    Long countDate(LocalDate date);

    ProvinceVO selectByNameAndDate(String provinceShortName, LocalDate date);
}
