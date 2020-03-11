package com.infect.backend.controller;

import com.infect.backend.model.CityVO;
import com.infect.backend.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@Controller
@RequestMapping("/cities")
public class CityController {

    @Resource(name = "cityServiceImpl")
    CityService cityService;

    /**
     * 获取某省的所有城市疫情
     *
     * @param province URL编码后的省名称
     * @return
     * @throws UnsupportedEncodingException
     */
    @GetMapping("list/{province}")
    @ResponseBody
    public List<CityVO> getCities(@PathVariable String province) throws UnsupportedEncodingException {
        String decodedName = URLDecoder.decode(URLDecoder.decode(province, "UTF-8"), "UTF-8");
        return cityService.selectCities(decodedName);
    }
}
