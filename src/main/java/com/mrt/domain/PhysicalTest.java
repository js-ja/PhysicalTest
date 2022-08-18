package com.mrt.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class PhysicalTest {
    private String sex;
    private Float height;
    private Float weight;
    // 肺活量
    @TableField(value = "vitalCapacity")
    private Float vitalCapacity;
    // 50m
    @TableField(value = "RunThe50m")
    private Float RunThe50m;
    // 立定跳远
    @TableField(value = "standingBroadJump")
    private Float standingBroadJump;
    // 1000m/800m
    @TableField(value = "RunThe1000mor800m")
    private Float RunThe1000mor800m;
    // 坐位体前屈
    @TableField(value = "sitAndReach")
    private Float sitAndReach;
    // 引体向上或者仰卧起坐
    @TableField(value = "SitupsOrPullups")
    private Float SitupsOrPullups;
    // 体测年份
    private Integer date;
}
