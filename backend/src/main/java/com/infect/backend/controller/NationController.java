package com.infect.backend.controller;

import com.infect.backend.model.NationVO;
import com.infect.backend.service.NationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/nations")
@Slf4j
public class NationController {

    @Resource(name = "nationServiceImpl")
    NationService nationService;

    /**
     * 获取全国疫情数据
     *
     * @return
     */
    @GetMapping("/all")
    @ResponseBody
    NationVO getNation() {
        log.info("收到请求：/nations/all");
        return nationService.select();
    }
}
