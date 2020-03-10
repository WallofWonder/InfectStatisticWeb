package com.infect.backend.service;

import com.infect.backend.model.NationVO;
import com.infect.backend.model.NcovCity;

import java.time.LocalDate;
import java.util.Date;

public interface ProvinceService {

    int insertProvince(NcovCity.News province, LocalDate date);

    NationVO getNationalProvince(LocalDate date, String type);

    Long countDate(LocalDate date);
}
