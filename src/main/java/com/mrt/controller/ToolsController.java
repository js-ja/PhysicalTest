package com.mrt.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.mrt.domain.Code;
import com.mrt.domain.Result;
import com.mrt.domain.tools.ProteinCalculator;
import com.mrt.exception.BusinessException;
import com.mrt.exception.SystemException;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/tools")
public class ToolsController {
    /*燃脂运动计算器*/
    @PostMapping("/burningFat")
    public Result FatBurningExerciseCalculator(@RequestBody Object data) {
        Map maps = (Map) data;
        float age = Float.parseFloat(maps.get("age").toString());
        DecimalFormat decimalFormat=new DecimalFormat(".0");
        double min = (220-age)*0.72;
        String minBurningFat = decimalFormat.format(min);
        double max = (220-age)*0.86;
        String maxBurningFat = decimalFormat.format(max);
        HashMap<String, Object> map = new HashMap<>();
        map.put("minBurningFat",minBurningFat);
        map.put("maxBurningFat",maxBurningFat);
        return new Result(Code.GET_OK,map,"");
    }
    /*补水计算器*/
    @PostMapping ("/waterRefill")
    public Result WaterRefillCalculator(@RequestBody Object data) {
        Map maps = (Map) data;
        float weight = Float.parseFloat(maps.get("weight").toString());
        long DrinkingWater_Total = Math.round((330000.0/10000.0)*weight);
        long DrinkingWater_AM_6_30 = Math.round((49500.0/10000.0)*weight);
        long DrinkingWater_AM_8_30 = Math.round((44880.0/10000.0)*weight);
        long DrinkingWater_AM_11_30 = Math.round((47982.0/10000.0)*weight);
        long DrinkingWater_PM_12_50 = Math.round((44880.0/10000.0)*weight);
        long DrinkingWater_PM_3_00 = Math.round((48675.0/10000.0)*weight);
        long DrinkingWater_PM_5_30 = Math.round((48213.0/10000.0)*weight);
        long DrinkingWater_PM_10_00 = Math.round((45870.0/10000.0)*weight);
        HashMap<String, Object> map = new HashMap<>();
        map.put("DrinkingWater_Total",DrinkingWater_Total);
        map.put("DrinkingWater_AM_6_30",DrinkingWater_AM_6_30);
        map.put("DrinkingWater_AM_8_30",DrinkingWater_AM_8_30);
        map.put("DrinkingWater_AM_11_30",DrinkingWater_AM_11_30);
        map.put("DrinkingWater_PM_12_50",DrinkingWater_PM_12_50);
        map.put("DrinkingWater_PM_3_00",DrinkingWater_PM_3_00);
        map.put("DrinkingWater_PM_5_30",DrinkingWater_PM_5_30);
        map.put("DrinkingWater_PM_10_00",DrinkingWater_PM_10_00);
        return new Result(Code.GET_OK,map,"");
    }
    /*BMI计算器*/
    @PostMapping ("/bmi")
    public Result bmi(@RequestBody Object data) {
        Map map = (Map) data;
        float height = Float.parseFloat(map.get("height").toString())/100;
        float weight = Float.parseFloat(map.get("weight").toString());
        if (height<=0|weight<=0) {
            throw new SystemException("数据异常", Code.DATA_ERR);
        }
        DecimalFormat decimalFormat=new DecimalFormat(".0");
        String bmi = decimalFormat.format(weight/(height*height));
        HashMap<String, Object> maps = new HashMap<>();
        maps.put("bmi",bmi);
        return new Result(Code.GET_OK,maps,"");
    }
    /*标准体重计算器*/
    @PostMapping("/standardWeight")
    public Result standardWeight(@RequestBody Object data) {
        Map maps = (Map) data;
        int sex = Integer.parseInt(maps.get("sex").toString());
        float height = Float.parseFloat(maps.get("height").toString());
        if (height<=0) {
            throw new SystemException("数据异常", Code.DATA_ERR);
        }
        DecimalFormat decimalFormat=new DecimalFormat(".0");
        String standardWeight=null;
        if (sex==1) {
            standardWeight = decimalFormat.format((height-80)*0.7);
        } else  {
            standardWeight = decimalFormat.format((height-70)*0.6);
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("standardWeight",standardWeight);
        return new Result(Code.GET_OK,map,"");
    }
    /*蛋白质计算器*/
    @PostMapping("/Protein")
    public Result Protein(@RequestBody Object data) {
        Map maps = (Map) data;
        DecimalFormat decimalFormat=new DecimalFormat(".0");
        HashMap<String, Object> map = new HashMap<>();
        float weight = Float.parseFloat(maps.get("weight").toString());
        map.put("minAveragePerson", decimalFormat.format((ProteinCalculator.minAveragePerson/100)*weight));
        map.put("maxAveragePerson", decimalFormat.format((ProteinCalculator.maxAveragePerson/100)*weight));
        map.put("minLostFat", decimalFormat.format((ProteinCalculator.minLostFat/100)*weight));
        map.put("maxLostFat", decimalFormat.format((ProteinCalculator.maxLostFat/100)*weight));
        map.put("minGainMuscle", decimalFormat.format((ProteinCalculator.minGainMuscle/100)*weight));
        map.put("maxGainMuscle", decimalFormat.format((ProteinCalculator.maxGainMuscle/100)*weight));
        map.put("minBodyBuilding", decimalFormat.format((ProteinCalculator.minBodyBuilding/100)*weight));
        map.put("maxBodyBuilding", decimalFormat.format((ProteinCalculator.maxBodyBuilding/100)*weight));
        return new Result(Code.GET_OK,map,"");
    }
    /*基础代谢率*/
    @PostMapping("/basalMetabolism")
    public Result basalMetabolism(@RequestBody Object data) {
        Map maps = (Map) data;
        DecimalFormat decimalFormat=new DecimalFormat(".0");
        HashMap<String, Object> map = new HashMap<>();
        int sex = Integer.parseInt(maps.get("sex").toString());
        float age = Float.parseFloat(maps.get("age").toString());
        float height = Float.parseFloat(maps.get("height").toString());
        float weight = Float.parseFloat(maps.get("weight").toString());
        Integer basalMetabolism;
        if (sex==1) {
            basalMetabolism = Integer.parseInt(String.valueOf(67+(13.73*weight)+(5*height)-(6.9*age)));
        } else {
            basalMetabolism = Integer.parseInt(String.valueOf(61+(9.6*weight)+(1.72*height)-(4.7*age)));
        }
        map.put("basalMetabolism",basalMetabolism);
        return new Result(Code.GET_OK,map,"");
    }
    /*运动热量计算器*/


}
