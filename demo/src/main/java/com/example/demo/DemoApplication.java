package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.test.Student;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    /*SpringApplication.run(DemoApplication.class, args);
    System.out.println("Hello World!");
    */
    ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
    Student obj1= (Student) context.getBean("st");
    System.out.println(obj1);
    
  }

}
