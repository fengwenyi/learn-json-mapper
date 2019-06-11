package com.fengwenyi.learn_json_mapper;

import com.alibaba.fastjson.JSON;
import org.springframework.util.StringUtils;

/**
 * @author Erwin Feng
 * @since 2019-06-11 22:36
 */
public class BeanUtils {

    /**
     * String 转 Bean
     * @param str
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T stringToBean(String str, Class<T> clazz) {
        if (StringUtils.isEmpty(str) || clazz == null) {
            return null;
        }
        if (clazz == int.class || clazz == Integer.class) {
            return (T) Integer.valueOf(str);
        }
        if (clazz == String.class) {
            return (T) str;
        }
        if (clazz == long.class || clazz == Long.class) {
            return (T) Long.valueOf(str);
        }
        return JSON.parseObject(str, clazz);
    }

    /**
     * Bean 转 String
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> String beanToString(T obj) {
        if (obj == null) {
            return null;
        }
        Class<?> clazz = obj.getClass();
        if (clazz == int.class || clazz == Integer.class) {
            return obj + "";
        } else if (clazz == String.class) {
            return (String) obj;
        } else if (clazz == long.class || clazz == Long.class) {
            return obj + "";
        }
        return JSON.toJSONString(obj);
    }

}
