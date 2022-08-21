package com.mrt.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mrt.domain.Calorimeter;

import java.util.List;

public interface FoodHeatScaleService {
    List<Calorimeter> selectList(String foodname);
}
