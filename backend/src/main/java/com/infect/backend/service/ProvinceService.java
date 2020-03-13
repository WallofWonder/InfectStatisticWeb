package com.infect.backend.service;

import com.infect.backend.entity.NcovCity;
import com.infect.backend.model.ProvinceMapVO;
import com.infect.backend.model.ProvincePO;
import com.infect.backend.model.ProvinceVO;

import java.time.LocalDate;
import java.util.List;

public interface ProvinceService {

    int insertProvince(NcovCity.News province, LocalDate date);

    ProvinceMapVO getNationalProvince(LocalDate date, String type);

    Long countDate(LocalDate date);

    ProvinceVO selectByNameAndDate(String provinceShortName, LocalDate date);

    List<ProvincePO> selectByName(String provinceShortName);

    int update(NcovCity.News province, LocalDate date);

    Boolean exists(String provinceShortName, LocalDate date);
}
