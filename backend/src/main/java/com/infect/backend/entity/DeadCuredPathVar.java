package com.infect.backend.entity;

import com.infect.backend.model.ProvincePO;
import com.infect.backend.model.ProvinceTendencyVO;

import java.util.ArrayList;
import java.util.List;

public class DeadCuredPathVar extends PathVar {
    @Override
    public List<ProvinceTendencyVO.Serie> getSeries() {
        List<ProvinceTendencyVO.Serie> series = new ArrayList<>();
        series.add(ProvinceTendencyVO.Serie.builder().name("治愈")
                .data(new ArrayList<>())
                .build());
        series.add(ProvinceTendencyVO.Serie.builder().name("死亡")
                .data(new ArrayList<>())
                .build());
        return series;
    }

    @Override
    public void insertData(ProvinceTendencyVO pTVO, ProvincePO po, ProvincePO poYesterday) {
        pTVO.getSeries().get(0).getData().add(po.getCuredcount());
        pTVO.getSeries().get(1).getData().add(po.getDeadcount());
    }
}
