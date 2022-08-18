package com.mrt.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mrt.domain.PhysicalTestProject;

import java.util.List;

public interface PhysicalTestService {
    List<PhysicalTestProject> selectAll(String database);

    Integer selectCount(LambdaQueryWrapper<PhysicalTestProject> lqw);
}
