package com.infect.backend.controller;

import com.alibaba.fastjson.JSON;
import com.infect.backend.model.NationVO;
import com.infect.backend.model.NcovCity;
import com.infect.backend.model.ProvincePO;
import com.infect.backend.service.ProvinceService;
import com.infect.backend.utils.DataRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller
@RequestMapping("/statistics")
public class StatisticController {

    @Resource(name = "provinceServiceImpl")
    ProvinceService provinceService;

    /**
     * @return
     */
    @GetMapping("/provinces/{type}")
    @ResponseBody
    NationVO getNationalProvinces(@PathVariable String type) {
        provinceService.getNationalProvince(LocalDate.now(), type);
        return null;
    }

    @PostMapping("/test")
    @ResponseBody
    String insert() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.now();
        String dateTimeStr = formatter.format(date);

        String jsonString = DataRequest.request(DataRequest.STATISICS, "&date=" + dateTimeStr);
        NcovCity ncovCity = JSON.parseObject(jsonString, NcovCity.class);
        for (NcovCity.News p : ncovCity.getNewsList()) {
            provinceService.insertProvince(p,date);
        }
        return "ok";
    }

}
