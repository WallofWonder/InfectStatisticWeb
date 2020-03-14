package com.infect.backend;

import com.alibaba.fastjson.JSON;
import com.infect.backend.dao.ProvinceDao;
import com.infect.backend.entity.NcovCity;
import com.infect.backend.model.ProvincePO;
import com.infect.backend.service.ProvinceService;
import com.infect.backend.utils.DataRequest;
import com.infect.backend.utils.ProvinceMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

@SpringBootTest
class DataRequestTest {

    @Resource
    ProvinceDao provinceDao;

    @Resource(name = "provinceServiceImpl")
    ProvinceService provinceService;

    @Test
    void request() {
        String jsonString1 = DataRequest.request(DataRequest.PROVINCE_AND_CITY_STATISICS, null, 0);
        String jsonString2 = DataRequest.request(DataRequest.PROVINCE_AND_CITY_STATISICS, null, 1);
        NcovCity ncovCity1 = JSON.parseObject(jsonString1, NcovCity.class);
        NcovCity ncovCity2 = JSON.parseObject(jsonString2, NcovCity.class);
        System.out.println(ncovCity1.getNewsList());
        System.out.println(ncovCity2.getNewsList());
    }

    @Test
    void selectTest() {
        System.out.println(provinceService.selectByNameAndDate("湖北", LocalDate.now()));
    }

    @Test
    void selectByNameTest() {
        List<ProvincePO> pos = provinceService.selectByName("湖北");
        System.out.println(ProvinceMapper.mapToTendency(pos, "currentConfirmed"));
    }
}
