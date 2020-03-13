package com.infect.backend.entity;

import com.infect.backend.model.ProvincePO;
import com.infect.backend.model.ProvinceTendencyVO;

import java.util.ArrayList;
import java.util.List;

public class ConfirmedIncrPathVar extends PathVar {
    @Override
    public List<ProvinceTendencyVO.Serie> getSeries() {
        List<ProvinceTendencyVO.Serie> series = new ArrayList<>();
        series.add(ProvinceTendencyVO.Serie.builder().name("新增确诊")
                .data(new ArrayList<>())
                .build());
        return series;
    }

    @Override
    public void insertData(ProvinceTendencyVO pTVO, ProvincePO po, ProvincePO poYesterday) {
        int confirmedIncr = po.getConfirmedcount() - poYesterday.getConfirmedcount();
        pTVO.getSeries().get(0).getData().add(confirmedIncr);
    }

}
