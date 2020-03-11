package com.infect.backend;

import com.alibaba.fastjson.JSON;
import com.infect.backend.dao.ProvinceDao;
import com.infect.backend.entity.NcovCity;
import com.infect.backend.utils.DataRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DataRequestTest {

    @Resource
    ProvinceDao provinceDao;

    @Test
    void request() {
        String jsonString = DataRequest.request(DataRequest.PROVINCE_AND_CITY_STATISICS, null);
        NcovCity ncovCity = JSON.parseObject(jsonString, NcovCity.class);
        System.out.println(ncovCity.getNewsList());
    }
}
