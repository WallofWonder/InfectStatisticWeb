package com.infect.backend.controller;

import com.infect.backend.model.HelloVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    HelloVO hello() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        return HelloVO.builder().message("hello world").messageList(list).build();
    }
}
