package com.infect.backend;

import com.alibaba.fastjson.JSON;
import com.infect.backend.dao.ProvinceDao;
import com.infect.backend.entity.NcovCity;
import com.infect.backend.service.ProvinceService;
import com.infect.backend.service.ProvinceServiceImpl;
import com.infect.backend.utils.DataRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDate;

@SpringBootTest
class DataRequestTest {

    @Resource
    ProvinceDao provinceDao;

    @Resource(name = "provinceServiceImpl")
    ProvinceService provinceService;

    @Test
    void request() {
        String jsonString = DataRequest.request(DataRequest.PROVINCE_AND_CITY_STATISICS, null);
        NcovCity ncovCity = JSON.parseObject(jsonString, NcovCity.class);
        System.out.println(ncovCity.getNewsList());
    }

    @Test
    void selectTest() {
        System.out.println(provinceService.selectByNameAndDate("湖北", LocalDate.now()));
    }
}
