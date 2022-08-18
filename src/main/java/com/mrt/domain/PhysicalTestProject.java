package com.mrt.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Student_test_data")
public class PhysicalTestProject {
    @TableField(value = "studentNumber")
    private String studentNumber;
    private String sex;
    @TableField(value = "theClassName")
    private String theClassName;
    private Float height;
    private Float weight;
    // 体重/身高^2 (kg/m)
    private Float bmi;
    // 肺活量
    @TableField(value = "vitalCapacity")
    private Float vitalCapacity;
    // 肺活量分数
    @TableField(value = "vitalCapacityScore")
    private Float vitalCapacityScore;
    // 50m
    @TableField(value = "RunThe50m")
    private Float RunThe50m;
    // 50m分数
    @TableField(value = "RunThe50mScore")
    private Float RunThe50mScore;
    // 立定跳远
    @TableField(value = "standingBroadJump")
    private Float standingBroadJump;
    // 立定跳远分数
    @TableField(value = "standingBroadJumpScore")
    private Float standingBroadJumpScore;
    // 1000m/800m
    @TableField(value = "RunThe1000mor800m")
    private Float RunThe1000mor800m;
    // 1000m/800m分数
    @TableField(value = "RunThe1000mor800mScore")
    private Float RunThe1000mor800mScore;
    // 坐位体前屈
    @TableField(value = "sitAndReach")
    private Float sitAndReach;
    // 坐位体前屈分数
    @TableField(value = "sitAndReachScore")
    private Float sitAndReachScore;
    // 引体向上或者仰卧起坐
    @TableField(value = "SitupsOrPullups")
    private Float SitupsOrPullups;
    // 引体向上或者仰卧起坐分数
    @TableField(value = "SitupsOrPullupsScore")
    private Float SitupsOrPullupsScore;
    // 柔韧性项目加分
    @TableField(value = "BonusPointsForFlexibility")
    private Float BonusPointsForFlexibility;
    // 耐力跑加分
    @TableField(value = "EnduranceRunningBonusPoints")
    private Float EnduranceRunningBonusPoints;
    // 健康评分
    @TableField(value = "HealthRecord")
    private Float HealthRecord;
    // 健康等级
    @TableField(value = "healthLevel")
    private String healthLevel;
    // 体测年份
    private Integer date;

}
