package com.infect.backend.controller;

import com.infect.backend.model.ProvinceDataVO;
import com.infect.backend.model.ProvinceMapVO;
import com.infect.backend.model.ProvinceTendencyVO;
import com.infect.backend.model.ProvinceVO;
import com.infect.backend.service.ProvinceService;
import com.infect.backend.utils.ProvinceMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.time.LocalDate;

@Controller
@RequestMapping("/statistics")
public class ProvinceController {

    @Resource(name = "provinceServiceImpl")
    ProvinceService provinceService;

    /**
     * 获取全国各省疫情数据
     *
     * @return
     */
    @GetMapping("/provinces/{type}")
    @ResponseBody
    ProvinceMapVO getNationalProvinces(@PathVariable String type) {
        return provinceService.getNationalProvince(LocalDate.now(), type);
    }

    /**
     * 获取某个省的数据
     *
     * @param province URL编码后的省名称
     * @return
     * @throws UnsupportedEncodingException
     */
    @GetMapping("/provinces/one/{province}")
    @ResponseBody
    ProvinceVO getProvince(@PathVariable String province) throws UnsupportedEncodingException {
        String decodedName = URLDecoder.decode(URLDecoder.decode(province, "UTF-8"), "UTF-8");
        return provinceService.selectByNameAndDate(decodedName, LocalDate.now());
    }

    /**
     * 获取某省疫情趋势
     *
     * @param province URL编码后的省名称
     * @return
     * @throws UnsupportedEncodingException
     */
    @GetMapping("/provinces/one/tends/{province}")
    @ResponseBody
    ProvinceTendencyVO getTendency(@PathVariable String province) throws UnsupportedEncodingException {
        String decodedName = URLDecoder.decode(URLDecoder.decode(province, "UTF-8"), "UTF-8");
        return ProvinceMapper.mapToTendency(provinceService.selectByName(decodedName));
    }
}
