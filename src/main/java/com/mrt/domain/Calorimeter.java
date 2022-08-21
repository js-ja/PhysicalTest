package com.mrt.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Food_heat_scale")
public class Calorimeter {
    @TableField(value = "foodname")
    private String foodname;
    @TableField(value = "imageUrl")
    private String imageUrl;
    private String heat;

}
