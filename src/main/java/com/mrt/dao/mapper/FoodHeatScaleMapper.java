package com.mrt.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mrt.domain.Calorimeter;
import com.mrt.domain.PhysicalTestProject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodHeatScaleMapper extends BaseMapper<Calorimeter> {
    List<Calorimeter> selectList(String foodname);
}
