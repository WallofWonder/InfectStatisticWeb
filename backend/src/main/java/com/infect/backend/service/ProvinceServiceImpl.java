package com.infect.backend.service;

import com.infect.backend.dao.ProvinceDao;
import com.infect.backend.model.NationVO;
import com.infect.backend.model.NcovCity;
import com.infect.backend.model.ProvincePOExample;
import com.infect.backend.utils.ProvinceMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Resource
    protected Mapper dozerMapper;

    @Resource
    private ProvinceDao provinceDao;

    @Override
    public int insertProvince(NcovCity.News province, LocalDate date) {
        provinceDao.insert(ProvinceMapper.mapToPO(province, date));
        return 1;
    }

    @Override
    public NationVO getNationalProvince(LocalDate date, String type) {
        ProvincePOExample example = new ProvincePOExample();
        ProvincePOExample.Criteria criteria = example.createCriteria();
        ZonedDateTime zonedDateTime = date.atStartOfDay(ZoneId.systemDefault());
        criteria.andDateEqualTo(Date.from(zonedDateTime.toInstant()));

        return ProvinceMapper.mapToNationVO(provinceDao.selectByExample(example), type);
    }

    @Override
    public Long countDate(LocalDate date) {
        ProvincePOExample example = new ProvincePOExample();
        ProvincePOExample.Criteria criteria = example.createCriteria();
        ZonedDateTime zonedDateTime = date.atStartOfDay(ZoneId.systemDefault());
        criteria.andDateEqualTo(Date.from(zonedDateTime.toInstant()));
        return provinceDao.countByExample(example);
    }
}
