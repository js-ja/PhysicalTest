package com.mrt.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mrt.domain.PhysicalTestProject;

import java.util.List;

public interface PhysicalTestService {
    List<PhysicalTestProject> selectList(LambdaQueryWrapper<PhysicalTestProject> lqw);

    Integer selectCount(LambdaQueryWrapper<PhysicalTestProject> lqw);
    /*平均身高*/
    Float AvgHeight();
    /*平均体重*/
    Float AvgWeight();
    /*最高身高*/
    Float MaxHeight();
    /*最重体重*/
    Float MaxWeight();
    /*最低身高*/
    Float MinHeight();
    /*最轻体重*/
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
