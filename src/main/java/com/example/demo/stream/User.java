package com.example.demo.stream;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: tangbingqun
 * @Date: 2021/3/26 下午3:09
 */


public class User implements Serializable{

    /**
     * 用户名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 兴趣爱好
     */

    private List<String> hobbies;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }



}
