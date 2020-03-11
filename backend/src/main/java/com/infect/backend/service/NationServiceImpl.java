package com.infect.backend.service;

import com.infect.backend.dao.NationDao;
import com.infect.backend.entity.Ncov;
import com.infect.backend.model.NationVO;
import com.infect.backend.utils.NationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class NationServiceImpl implements NationService{

    @Resource
    private NationDao nationDao;


    @Override
    public void insert(Ncov.NewsList.Desc desc) {
        nationDao.insert(NationMapper.mapToPO(desc));
    }

    @Override
    public NationVO select() {
        return NationMapper.mapToVO(nationDao.selectByPrimaryKey(1));
    }

    @Override
    public void truncate() {
        nationDao.truncate();
    }
}
