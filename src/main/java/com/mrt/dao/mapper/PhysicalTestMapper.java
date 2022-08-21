package com.mrt.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mrt.domain.PhysicalTestProject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhysicalTestMapper extends BaseMapper<PhysicalTestProject> {
    List<PhysicalTestProject> selectAll(String database);

    Integer count();

    Float AvgHeight();
    Float AvgWeight();
    Float MaxHeight();
    Float MaxWeight();
    Float MinHeight();
    Float MinWeight();
    Float MaxvitalCapacity();
    Float MinvitalCapacity();
    Float MaxRunThe50m();
    Float MinRunThe50m();
    Float MaxstandingBroadJump();
    Float MinstandingBroadJump();
    Float MaxRunThe1000mor800m();
    Float MinRunThe1000mor800m();
    Float MaxsitAndReach();
    Float MinsitAndReach();
    Float MaxSitupsOrPullups();
    Float MinSitupsOrPullups();

}
