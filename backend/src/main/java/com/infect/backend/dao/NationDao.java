package com.infect.backend.dao;

import com.infect.backend.model.NationPO;
import com.infect.backend.model.NationPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NationDao {
    long countByExample(NationPOExample example);

    int deleteByExample(NationPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NationPO record);

    int insertSelective(NationPO record);

    List<NationPO> selectByExample(NationPOExample example);

    NationPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NationPO record, @Param("example") NationPOExample example);

    int updateByExample(@Param("record") NationPO record, @Param("example") NationPOExample example);

    int updateByPrimaryKeySelective(NationPO record);

    int updateByPrimaryKey(NationPO record);

    void truncate();
}
