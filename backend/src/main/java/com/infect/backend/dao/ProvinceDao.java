package com.infect.backend.dao;

import com.infect.backend.model.ProvincePO;
import com.infect.backend.model.ProvincePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvinceDao {
    long countByExample(ProvincePOExample example);

    int deleteByExample(ProvincePOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProvincePO record);

    int insertSelective(ProvincePO record);

    List<ProvincePO> selectByExample(ProvincePOExample example);

    ProvincePO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProvincePO record, @Param("example") ProvincePOExample example);

    int updateByExample(@Param("record") ProvincePO record, @Param("example") ProvincePOExample example);

    int updateByPrimaryKeySelective(ProvincePO record);

    int updateByPrimaryKey(ProvincePO record);
}