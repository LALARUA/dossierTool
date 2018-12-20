package com.supermap.dossiertool.pojo;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 17:02 2018/12/20 0020
 */
public class Test {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
