package com.mrt.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class PhysicalTestQuery extends PhysicalTest {
    private Float height2;

    private Float weight2;

    private Float vitalCapacity2;

    private Float RunThe50m2;

    private Float standingBroadJump2;

    private Float RunThe1000mor800m2;

    private Float sitAndReach2;

    private Float SitupsOrPullups2;
}
