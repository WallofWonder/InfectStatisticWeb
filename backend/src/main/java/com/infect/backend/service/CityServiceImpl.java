package com.infect.backend.service;

import com.infect.backend.dao.CityDao;
import com.infect.backend.model.CityPOExample;
import com.infect.backend.model.NcovCity;
import com.infect.backend.utils.CityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityDao cityDao;


    @Override
    public int insertCity(NcovCity.News.City city, LocalDate date) {
        cityDao.insert(CityMapper.mapToPO(city, date));
        return 1;
    }

    @Override
    public Long countDate(LocalDate date) {
        CityPOExample example = new CityPOExample();
        CityPOExample.Criteria criteria = example.createCriteria();
        ZonedDateTime zonedDateTime = date.atStartOfDay(ZoneId.systemDefault());
        criteria.andDateEqualTo(Date.from(zonedDateTime.toInstant()));
        return cityDao.countByExample(example);
    }
}
