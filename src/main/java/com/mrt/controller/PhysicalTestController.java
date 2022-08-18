package com.mrt.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.mrt.domain.Code;
import com.mrt.domain.PhysicalTestProject;
import com.mrt.domain.Result;
import com.mrt.service.PhysicalTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/physicaltests")
public class PhysicalTestController {
    @Autowired
    private PhysicalTestService physicalTestService;

    @GetMapping("/{date}")
    public Result selectAll(@PathVariable Integer date) {
        String database = null;
        if (date == 2017) {
            database = "Student_test_data_in_2017";
        } else if (date == 2016) {
            database = "Student_test_data_in_2016";
        } else if (date == 2015) {
            database = "Student_test_data_in_2015";
        } else if (date == 2014) {
            database = "Student_test_data_in_2014";
        }
        List<PhysicalTestProject> physicalTestProjects = physicalTestService.selectAll(database);
        Integer code = physicalTestProjects!=null? Code.GET_OK:Code.GET_ERR;
        String msg = physicalTestProjects!=null?"":"数据查询失败，请重试!";
        return new Result(code,physicalTestProjects,msg);
    }
    @PostMapping
    public void selectList(PhysicalTestProject ptp) {
        LambdaQueryWrapper<PhysicalTestProject> lqw = new LambdaQueryWrapper<>();
        Integer list = physicalTestService.selectCount(lqw);

    }
}
