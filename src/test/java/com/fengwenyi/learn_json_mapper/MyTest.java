package com.fengwenyi.learn_json_mapper;

import org.junit.Test;

/**
 * @author Erwin Feng
 * @since 2019-06-11 22:40
 */
public class MyTest {

    @Test
    public void jsonMapperTest() {
        User user = new User()
                .setName("Zhangsan")
                .setAge(20);
        String str = JsonMapper.obj2String(user);
        System.out.println(str); // {"name":"Zhangsan","age":20}

//        JsonMapper.string2Obj(str, User.class);
    }

    @Test
    public void beanUtilsTest() {
        User user = new User()
                .setName("Zhangsan")
                .setAge(20);
        String str = BeanUtils.beanToString(user);
        System.out.println(str); // {"age":20,"name":"Zhangsan"}

        User obj = BeanUtils.stringToBean(str, User.class);
        System.out.println(obj); // User(name=Zhangsan, age=20)
    }
}
