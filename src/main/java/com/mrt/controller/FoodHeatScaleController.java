package com.mrt.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mrt.domain.Calorimeter;
import com.mrt.domain.Code;
import com.mrt.domain.Result;
import com.mrt.service.FoodHeatScaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/FoodHeatScales")
public class FoodHeatScaleController {
    @Autowired
    private FoodHeatScaleService foodHeatScaleService;
    @PostMapping("/foodHeat")
    public Result selectList(@RequestBody Object data) {
        Map maps = (Map) data;
        String foodName = maps.get("foodName").toString();
        System.out.println(foodName);
        List<Calorimeter> calorimeters = foodHeatScaleService.selectList(foodName);
        Integer code = calorimeters!=null? Code.GET_OK:Code.GET_ERR;
        String msg = calorimeters!=null?"":"查询条件不符合要求，请重试!";
        return new Result(code,calorimeters,msg);
    }
}
