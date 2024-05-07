package com.mingmou.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
//    响应码,1成功,0失败
    private Integer code;
//    响应信息
    private String msg;
//    返回的数据类型
    private Object data;
    public static Result success(){
        //增删改成功
        return new Result(1,"成功了捏",null);
    }
    public static Result success(Object data){
        return new Result(1,"成功了捏", data);
    }
    public static Result error(String msg){
        return new Result(0,msg,null);
    }
}
