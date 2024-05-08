package com.mingmou.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Health {
    private int id;
    private String username;
    private int age;
    private String gender;
    private int height;
    private int weight;
    private String  disease_history;//疾病史
    private String cognitive_level;//认知水平
    private String diet_condition;//饮食水平
    private String daily_exercise;//每日运动量
    private String mental_condition;//心理情况
}
