package com.infect.backend.entity;

import com.infect.backend.model.ProvincePO;
import com.infect.backend.model.ProvinceTendencyVO;

import java.util.ArrayList;
import java.util.List;

public class CurrentConfirmedPathVar extends PathVar {
    @Override
    public List<ProvinceTendencyVO.Serie> getSeries() {
        List<ProvinceTendencyVO.Serie> series = new ArrayList<>();
        series.add(ProvinceTendencyVO.Serie.builder().name("现存确诊")
                .data(new ArrayList<>())
                .build());
        return series;
    }

    @Override
    public void insertData(ProvinceTendencyVO pTVO, ProvincePO po) {
        pTVO.getSeries().get(0).getData().add(po.getCurrentconfirmedcount());
    }

}
