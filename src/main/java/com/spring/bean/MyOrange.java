package com.spring.bean;

/*
 * @Author: demussong
 * @Description:
 * @Date: 2023/1/4 20:40
 */
public class MyOrange {
    private Orange orange;

    public Orange getOrange() {
        return orange;
    }

    public void setOrange(Orange orange) {
        this.orange = orange;
    }

    @Override
    public String toString() {
        return "MyOrange{" +
                "orange=" + orange +
                '}';
    }
}
