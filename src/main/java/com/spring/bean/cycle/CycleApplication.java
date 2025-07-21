package com.spring.bean.cycle;

import com.spring.config.MainConfigOfAutowoired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author demussong
 * @describe
 * @date 2025/7/22 00:03
 */
//@ComponentScan("com.spring.bean.cycle")
public class CycleApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.spring.bean.cycle");

        Demus demus = applicationContext.getBean(Demus.class);
    }

}
