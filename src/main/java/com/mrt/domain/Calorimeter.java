package com.mrt.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Food_Heat_Table")
public class Calorimeter {
    @TableField(value = "foodName")
    private String foodname;
    @TableField(value = "imageUrl")
    private String imageUrl;
    private String heat;
    private int sort;

}
