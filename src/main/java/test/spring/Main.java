package test.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URL;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");

        Calculator calculator = applicationContext.getBean(Calculator.class);

        System.out.println(calculator.subtract(10, 2));

    }

}
