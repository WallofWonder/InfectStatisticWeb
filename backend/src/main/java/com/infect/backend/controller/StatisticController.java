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
     * 获取全国各省疫情数据
     * @return
     */
    @GetMapping("/provinces/{type}")
    @ResponseBody
    NationVO getNationalProvinces(@PathVariable String type) {
        return provinceService.getNationalProvince(LocalDate.now(), type);
    }
}
