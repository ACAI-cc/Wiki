package com.jiawa.mapper;

import com.jiawa.wiki.domain.ReadProgress;
import com.jiawa.wiki.domain.ReadProgressExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ReadProgressMapper {
    long countByExample(ReadProgressExample example);

    int deleteByExample(ReadProgressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReadProgress record);

    int insertSelective(ReadProgress record);

    List<ReadProgress> selectByExample(ReadProgressExample example);

    ReadProgress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReadProgress record, @Param("example") ReadProgressExample example);

    int updateByExample(@Param("record") ReadProgress record, @Param("example") ReadProgressExample example);

    int updateByPrimaryKeySelective(ReadProgress record);

    int updateByPrimaryKey(ReadProgress record);
}