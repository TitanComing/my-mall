package com.peng.mall.mapper;

import com.peng.mall.model.Counttest;
import com.peng.mall.model.CounttestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CounttestMapper {
    long countByExample(CounttestExample example);

    int deleteByExample(CounttestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Counttest record);

    int insertSelective(Counttest record);

    List<Counttest> selectByExample(CounttestExample example);

    Counttest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Counttest record, @Param("example") CounttestExample example);

    int updateByExample(@Param("record") Counttest record, @Param("example") CounttestExample example);

    int updateByPrimaryKeySelective(Counttest record);

    int updateByPrimaryKey(Counttest record);
}