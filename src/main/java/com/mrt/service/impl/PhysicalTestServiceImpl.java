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

    @Override
    public Float AvgHeight() {
        return physicalTestMapper.AvgHeight();
    }

    @Override
    public Float AvgWeight() {
        return physicalTestMapper.AvgWeight();
    }

    @Override
    public Float MaxHeight() {
        return physicalTestMapper.MaxHeight();
    }
    @Override
    public Float MaxWeight() {
        return physicalTestMapper.MaxWeight();
    }

    @Override
    public Float MinHeight() {
        return physicalTestMapper.MinHeight();
    }
    @Override
    public Float MinWeight() {
        return physicalTestMapper.MinWeight();
    }

    @Override
    public Float MaxvitalCapacity() {
        return physicalTestMapper.MaxvitalCapacity();
    }

    @Override
    public Float MinvitalCapacity() {
        return physicalTestMapper.MinvitalCapacity();
    }

    @Override
    public Float MaxRunThe50m() {
        return physicalTestMapper.MaxRunThe50m();
    }

    @Override
    public Float MinRunThe50m() {
        return physicalTestMapper.MinRunThe50m();
    }

    @Override
    public Float MaxstandingBroadJump() {
        return physicalTestMapper.MaxstandingBroadJump();
    }

    @Override
    public Float MinstandingBroadJump() {
        return physicalTestMapper.MinstandingBroadJump();
    }

    @Override
    public Float MaxRunThe1000mor800m() {
        return physicalTestMapper.MaxRunThe1000mor800m();
    }

    @Override
    public Float MinRunThe1000mor800m() {
        return physicalTestMapper.MinRunThe1000mor800m();
    }

    @Override
    public Float MaxsitAndReach() {
        return physicalTestMapper.MaxsitAndReach();
    }

    @Override
    public Float MinsitAndReach() {
        return physicalTestMapper.MinsitAndReach();
    }

    @Override
    public Float MaxSitupsOrPullups() {
        return physicalTestMapper.MaxSitupsOrPullups();
    }

    @Override
    public Float MinSitupsOrPullups() {
        return physicalTestMapper.MinSitupsOrPullups();
    }
}
