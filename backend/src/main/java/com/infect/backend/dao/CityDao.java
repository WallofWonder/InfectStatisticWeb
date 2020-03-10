package com.infect.backend.dao;

import com.infect.backend.model.CityPO;
import com.infect.backend.model.CityPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityDao {
    long countByExample(CityPOExample example);

    int deleteByExample(CityPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CityPO record);

    int insertSelective(CityPO record);

    List<CityPO> selectByExample(CityPOExample example);

    CityPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CityPO record, @Param("example") CityPOExample example);

    int updateByExample(@Param("record") CityPO record, @Param("example") CityPOExample example);

    int updateByPrimaryKeySelective(CityPO record);

    int updateByPrimaryKey(CityPO record);
}