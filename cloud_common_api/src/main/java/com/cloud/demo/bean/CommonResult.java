package com.cloud.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 24629
 * @Description
 * @create 2022-03-13 9:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data = null;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
