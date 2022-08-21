package com.mrt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mrt.dao.mapper.FoodHeatScaleMapper;
import com.mrt.domain.Calorimeter;
import com.mrt.service.FoodHeatScaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodHeatScaleServiceImpl implements FoodHeatScaleService {
    @Autowired
    private FoodHeatScaleMapper foodHeatScaleMapper;
    @Override
    public List<Calorimeter> selectList(String foodname) {
        return foodHeatScaleMapper.selectList(foodname);
    }
}
