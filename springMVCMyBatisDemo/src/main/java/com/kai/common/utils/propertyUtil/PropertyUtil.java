package com.kai.common.utils.propertyUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @Description :文件获取工具类
 * @Author: Zengkai
 * @Date: Created On 17:34  2017/6/4.
 * @Email: 756008519@qq.com
 */
public class PropertyUtil {
    private static final Logger log = LoggerFactory.getLogger(PropertyUtil.class);
    private static Properties props;

    synchronized static private void loadProps(){
        String filePath = "exceptionCode.properties";
        log.info("开始加载properties文件内容.......");
        props = new Properties();
        InputStreamReader in = null;
        try {
            //这里处理乱码
            in =new InputStreamReader(PropertyUtil.class.getClassLoader().getResourceAsStream(filePath),"UTF-8");
            props.load(in);
        }catch (FileNotFoundException e){
            log.error(filePath+"文件未找到");
        }catch (IOException e) {
            log.error("出现IOException");
        }finally {
            try {
                if(null != in) {
                    in.close();
                }
            } catch (IOException e) {
                log.error(filePath+"文件流关闭出现异常");
            }
        }
        log.info("加载properties文件内容完成...........");
    }

    public static String getProperty(String key){
        if(null == props) {
            loadProps();
        }
        return props.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue,String propFileName) {
        if(null == props) {
            loadProps();
        }
        return props.getProperty(key, defaultValue);
    }

}
