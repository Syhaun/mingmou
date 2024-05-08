package com.mingmou.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Life {
    private int id;
    private String username;
    private String  residence_status;
    private String activity_level;
    private String hobbies;
    private String social_frequency;
    private String consumption_level;
    private String travel_preference;
    private String  personality;
    private String average_sleep_time;
}
