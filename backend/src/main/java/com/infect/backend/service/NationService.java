package com.infect.backend.service;

import com.infect.backend.entity.Ncov;
import com.infect.backend.model.NationVO;

public interface NationService {
    void insert(Ncov.NewsList.Desc desc, Ncov.NewsList.Desc descFormer);

    NationVO select();

    void truncate();
}
