package com.kai.controller;

import com.kai.exception.CustomExption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 * @Description :
 * @Author: Zengkai
 * @Date: Created On 18:42  2017/6/4.
 * @Email: 756008519@qq.com
 */
@RestController
public class UserController extends BaseController {
     private Logger log = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value="/test",method= RequestMethod.GET,produces="application/json;charset=UTF-8")
    public String test(Integer id) throws CustomExption {
        log.debug("接受参数 id-->"+id);
        if(id==1){
            throw new CustomExption(1500);
        }
       return retContent(0,id);
    }
}
