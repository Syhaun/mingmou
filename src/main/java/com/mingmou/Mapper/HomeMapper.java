package com.mingmou.Mapper;

import com.mingmou.Pojo.Health;
import com.mingmou.Pojo.Life;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeMapper {
    //    健康信息的insert
    @Insert("INSERT INTO health_information (username, age, gender, height, weight, disease_history, cognitive_level, diet_condition, daily_exercise, mental_condition)" +
            "VALUES (#{username}, #{age}, #{gender}, #{height}, #{weight}, #{disease_history}, #{cognitive_level}, #{diet_condition}, #{daily_exercise}, #{mental_condition});")
    void insert_health(Health health);
//    生活信息的insert
    @Insert("INSERT INTO lifestyle_information (username, residence_status, activity_level, hobbies, social_frequency, consumption_level, travel_preference, personality, average_sleep_time)" +
            "VALUES (#{username}, #{residence_status}, #{activity_level}, #{hobbies}, #{social_frequency}, #{consumption_level}, #{travel_preference}, #{personality}, #{average_sleep_time});")
   void  insert_life(Life life);
}
