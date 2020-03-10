package com.infect.backend;

import com.alibaba.fastjson.JSON;
import com.infect.backend.dao.ProvinceDao;
import com.infect.backend.model.NcovCity;
import com.infect.backend.utils.DataRequest;
import com.infect.backend.utils.ProvinceMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class DataRequestTest {

    @Resource
    ProvinceDao provinceDao;

    @Test
    void request() {
        String jsonString = DataRequest.request(DataRequest.STATISICS, null);
        NcovCity ncovCity = JSON.parseObject(jsonString, NcovCity.class);
        System.out.println(ncovCity.getNewsList());
    }
}
