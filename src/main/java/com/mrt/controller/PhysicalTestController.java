package com.mrt.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mrt.domain.*;
import com.mrt.service.PhysicalTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/physical")
public class PhysicalTestController {



    @Autowired
    private PhysicalTestService physicalTestService;
    @PostMapping
    public Result selectCount(@RequestBody PhysicalTestQuery ptq) {
        LambdaQueryWrapper<PhysicalTestProject> lqw = new LambdaQueryWrapper<>();

        if (ptq.getDate().length!=0) {
            lqw.in(PhysicalTestProject::getDate, (Object[]) ptq.getDate());
        }

        if (ptq.getSex().equals("1")| ptq.getSex().equals("2")) {
            lqw.eq(PhysicalTestProject::getSex,ptq.getSex());
        }

        if (ptq.getHeight()>= physicalTestService.MinHeight()&ptq.getHeight2()<= physicalTestService.MaxHeight()) {
            lqw.between(PhysicalTestProject::getHeight,ptq.getHeight(),ptq.getHeight2());
        }

        if (ptq.getWeight()>= physicalTestService.MinWeight()&ptq.getWeight2()<= physicalTestService.MaxWeight()) {
            lqw.between(PhysicalTestProject::getWeight,ptq.getWeight(),ptq.getWeight2());
        }

        if (ptq.getVitalCapacity()>=physicalTestService.MinvitalCapacity()&ptq.getVitalCapacity2()<=physicalTestService.MaxvitalCapacity()) {
            lqw.between(PhysicalTestProject::getVitalCapacity,ptq.getVitalCapacity(),ptq.getVitalCapacity2());
        }

        if (ptq.getRunThe50m()>=physicalTestService.MinRunThe50m()&ptq.getRunThe50m2()<=physicalTestService.MaxRunThe50m()) {
            lqw.between(PhysicalTestProject::getRunThe50m,ptq.getRunThe50m(),ptq.getRunThe50m2());
        }



        Integer physicalTestProjects = physicalTestService.selectCount(lqw);
        Integer code = physicalTestProjects!=0? Code.GET_OK:Code.GET_ERR;
        String msg = physicalTestProjects!=0?"":"???????????????????????????????????????!";
        return new Result(code,physicalTestProjects,msg);

    }

    @PostMapping("/selectByDates")
    public void selectByDates(@RequestBody Integer[] dates) {
        LambdaQueryWrapper<PhysicalTestProject> lqw = new LambdaQueryWrapper<>();
        lqw.in(PhysicalTestProject::getDate, (Object[]) dates);
        Integer integer = physicalTestService.selectCount(lqw);
        System.out.println(integer);
    }

    @GetMapping ("/date/{date}")
    public void selectByDate(@PathVariable Integer date) {
        LambdaQueryWrapper<PhysicalTestProject> lqw = new LambdaQueryWrapper<>();
        lqw.in(PhysicalTestProject::getDate,date);
        Integer integer = physicalTestService.selectCount(lqw);
        System.out.println(integer);
    }

    @PostMapping("/find")
    private void find(@RequestBody Object data) {
        System.out.println(data);
        System.out.println(123);
        Map map = (Map) data;
        Float height = Float.valueOf(map.get("height").toString());
        Float weight = Float.valueOf(map.get("weight").toString());
    }
    /*Personal physical test results ??????????????????*/
    @PostMapping("/pptr")
    private Result personalPhysicalTestResults(@RequestBody Object data) {
        LambdaQueryWrapper<PhysicalTestProject> lqw = new LambdaQueryWrapper<>();
        Map map = (Map) data;
        Integer date = Integer.parseInt(map.get("date").toString());
        String studentNumber = map.get("studentNumber").toString();
        lqw.eq(PhysicalTestProject::getStudentNumber,studentNumber);
        lqw.eq(PhysicalTestProject::getDate,date);
        List<PhysicalTestProject> physicalTestProjects = physicalTestService.selectList(lqw);
        Integer code = physicalTestProjects!=null? Code.GET_OK:Code.GET_ERR;
        String msg = physicalTestProjects!=null?"":"???????????????????????????????????????!";
        return new Result(code,physicalTestProjects,msg);
    }

}
