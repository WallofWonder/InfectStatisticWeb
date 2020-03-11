package com.infect.backend.controller;

import com.infect.backend.model.ProvinceMapVO;
import com.infect.backend.service.ProvinceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDate;

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
    ProvinceMapVO getNationalProvinces(@PathVariable String type) {
        return provinceService.getNationalProvince(LocalDate.now(), type);
    }
}
