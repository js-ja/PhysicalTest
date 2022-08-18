package com.mrt.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mrt.domain.PhysicalTestProject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhysicalTestMapper extends BaseMapper<PhysicalTestProject> {
    List<PhysicalTestProject> selectAll(String database);

    Integer count();

}
