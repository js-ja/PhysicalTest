package com.mrt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mrt.dao.mapper.PhysicalTestMapper;
import com.mrt.domain.PhysicalTestProject;
import com.mrt.service.PhysicalTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PhysicalTestServiceImpl implements PhysicalTestService {
    @Autowired
    private PhysicalTestMapper physicalTestMapper;

    @Override
    public List<PhysicalTestProject> selectAll(String database) {
        return physicalTestMapper.selectAll(database);
    }

    @Override
    public Integer selectCount(LambdaQueryWrapper<PhysicalTestProject> lqw) {
        return physicalTestMapper.selectCount(lqw);
    }
}
