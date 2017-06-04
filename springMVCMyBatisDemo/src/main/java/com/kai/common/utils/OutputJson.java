package com.kai.common.utils;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @Description :
 * 返回客户端统一格式，包括状态码，提示信息，以及业务数据
 * @Author: Zengkai
 * @Date: Created On 17:17  2017/6/4.
 * @Email: 756008519@qq.com
 */
public class OutputJson implements Serializable{
    private static final long serialVersionUID = -6246736867249503995L;
    //状态码
    private int status;
    //必要的提示信息
    private String message;
    //业务数据
    private Object data;
    //时间
    private String time;

    public OutputJson(){}
    public OutputJson(int status,String message,Object data,String time){
        this.status = status;
        this.message = message;
        this.data = data;
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String toString(){
        if(null == this.data){
            this.setData(new Object());
        }
        return JSON.toJSONString(this);
    }
}
