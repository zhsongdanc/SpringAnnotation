package com.spring.maintest;

import com.spring.bean.Color;
import com.spring.bean.MyOrange;
import com.spring.bean.Person;
import com.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MainTest {

    //配置文件的方式
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) context.getBean("person");
//        System.out.println(person);
//    }

    //只使用注解的方式
    public static void main(String[] args) {
        String scanPackage = "com.spring";
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(scanPackage);


        MyOrange myOrange = applicationContext.getBean(MyOrange.class);

        System.out.println(myOrange);

        System.out.println("=========");
        String[] names = applicationContext.getBeanNamesForType(Color.class);

        for (String name : names) {
            System.out.println(name);
        }

    }
}
