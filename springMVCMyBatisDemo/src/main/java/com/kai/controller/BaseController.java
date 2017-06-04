package com.kai.controller;

import com.kai.common.utils.ReturnFormat;

/**
 * @Description :处理返回统一json格式
 * @Author: Zengkai
 * @Date: Created On 18:39  2017/6/4.
 * @Email: 756008519@qq.com
 */
public abstract class BaseController {
    protected String retContent(int status,Object data) {
        return ReturnFormat.retParam(status, data);
    }
}
