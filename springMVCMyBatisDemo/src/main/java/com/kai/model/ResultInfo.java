package com.kai.model;

import java.io.Serializable;

/**
 * @Description :
 * @Author: Zengkai
 * @Date: Created On 16:16  2017/6/4.
 * @Email: 756008519@qq.com
 */
public class ResultInfo implements Serializable{
    private static final long serialVersionUID = -5406029046265279967L;
    private String message;
    public ResultInfo(){}
    public ResultInfo(String message){
        this.message =message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
