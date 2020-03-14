package com.infect.backend.utils;

import com.infect.backend.entity.Ncov;
import com.infect.backend.model.NationPO;
import com.infect.backend.model.NationVO;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NationMapper {

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static NationPO mapToPO(Ncov.NewsList.Desc desc, Ncov.NewsList.Desc descFormer) {
        return NationPO.builder()
                .modifytime(desc.getModifytime())
                .confirmedcount(desc.getConfirmedcount())
                .currentconfirmedcount(desc.getCurrentconfirmedcount())
                .suspectedcount(desc.getSuspectedcount())
                .curedcount(desc.getCuredcount())
                .deadcount(desc.getDeadcount())
                .seriouscount(desc.getSeriouscount())
                .confirmedincr(desc.getConfirmedcount()-descFormer.getConfirmedcount())
                .currentconfirmedincr(desc.getCurrentconfirmedcount()-descFormer.getCurrentconfirmedcount())
                .suspectedincr(desc.getSuspectedcount()-descFormer.getSuspectedcount())
                .curedincr(desc.getCuredcount()-descFormer.getCuredcount())
                .deadincr(desc.getDeadcount()-descFormer.getDeadcount())
                .seriousincr(desc.getSeriouscount()-descFormer.getSeriouscount())
                .build();
    }


    public static NationVO mapToVO(NationPO po) {
        return NationVO.builder()
                .modifytime(stampToDate(po.getModifytime()))
                .confirmedcount(po.getConfirmedcount())
                .confirmedincr(po.getConfirmedincr())
                .curedcount(po.getCuredcount())
                .curedincr(po.getCuredincr())
                .currentconfirmedcount(po.getCurrentconfirmedcount())
                .currentconfirmedincr(po.getCurrentconfirmedincr())
                .deadcount(po.getDeadcount())
                .deadincr(po.getDeadincr())
                .seriouscount(po.getSeriouscount())
                .seriousincr(po.getSeriousincr())
                .suspectedcount(po.getSuspectedcount())
                .suspectedincr(po.getSuspectedincr())
                .build();
    }

    /*
     * 将时间戳转换为时间
     */
    public static String stampToDate(Long timeStamp) {
        return sdf.format(new Date(timeStamp));
    }
}
