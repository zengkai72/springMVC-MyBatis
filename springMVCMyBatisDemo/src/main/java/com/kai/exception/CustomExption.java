package com.kai.exception;

/**
 * @Description :自定义异常类
 * @Author: Zengkai
 * @Date: Created On 19:06  2017/6/4.
 * @Email: 756008519@qq.com
 */
public class CustomExption extends Exception {
    private Integer status;
    private String message;
    public CustomExption(Integer status,String message){
        this.status = status;
        this.message = message;
    }
    public CustomExption(Integer status){
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
