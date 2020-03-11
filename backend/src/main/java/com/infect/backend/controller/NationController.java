package com.infect.backend.controller;

import com.infect.backend.model.NationVO;
import com.infect.backend.service.NationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/nations")
public class NationController {

    @Resource(name = "nationServiceImpl")
    NationService nationService;

    @GetMapping("/all")
    @ResponseBody
    NationVO getNation(){
        return nationService.select();
    }
}
