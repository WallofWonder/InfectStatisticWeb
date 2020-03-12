package com.infect.backend.entity;

import com.infect.backend.model.ProvincePO;
import com.infect.backend.model.ProvinceTendencyVO;

import java.util.List;

public abstract class PathVar {
    public abstract List<ProvinceTendencyVO.Serie> getSeries();

    public abstract void insertData(ProvinceTendencyVO pTVO, ProvincePO po);
}
