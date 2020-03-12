package com.infect.backend.utils;

import com.infect.backend.entity.PathVar;
import com.infect.backend.entity.PathVarFactory;
import com.infect.backend.model.ProvinceMapVO;
import com.infect.backend.entity.NcovCity;
import com.infect.backend.model.ProvincePO;
import com.infect.backend.model.ProvinceTendencyVO;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

public class ProvinceMapper {
    public static ProvincePO mapToPO(NcovCity.News p, LocalDate date) {
        ZonedDateTime zonedDateTime = date.atStartOfDay(ZoneId.systemDefault());

        return ProvincePO.builder()
                .date(Date.from(zonedDateTime.toInstant()))
                .provinceshortname(p.getProvinceShortName())
                .currentconfirmedcount(p.getCurrentConfirmedCount())
                .confirmedcount(p.getConfirmedCount())
                .suspectedcount(p.getSuspectedCount())
                .curedcount(p.getCuredCount())
                .deadcount(p.getDeadCount())
                .build();
    }

    public static ProvinceMapVO mapToNationVO(List<ProvincePO> provincePOS, String type) {
        ProvinceMapVO provinceMapVO = new ProvinceMapVO();
        for (ProvincePO pp : provincePOS) {
            ProvinceMapVO.NationalProvinceVO npVO = new ProvinceMapVO.NationalProvinceVO();
            npVO.setName(pp.getProvinceshortname());
            if (type.equals("currentconfirmed")) {
                npVO.setValue(pp.getCurrentconfirmedcount());
            }
            else if (type.equals("confirmed")) {
                npVO.setValue(pp.getConfirmedcount());
            }
            provinceMapVO.getProvinces().add(npVO);
        }
        return provinceMapVO;
    }

    public static ProvinceTendencyVO mapToTendency(List<ProvincePO> pos, String type) {
        ProvinceTendencyVO pTVo = new ProvinceTendencyVO();

        PathVar pathVar = PathVarFactory.makePathVar(type);

        pTVo.setSeries(pathVar.getSeries());

        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd");
        for (ProvincePO po : pos) {
            pTVo.getDates().add(formatter.format(po.getDate()));
            pathVar.insertData(pTVo, po);
        }
        return pTVo;
    }
}
