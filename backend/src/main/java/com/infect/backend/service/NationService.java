package com.infect.backend.service;

import com.infect.backend.entity.Ncov;
import com.infect.backend.entity.NcovCity;
import com.infect.backend.model.NationVO;

public interface NationService {
    void insert(Ncov.NewsList.Desc desc);

    NationVO select();

    void truncate();
}
