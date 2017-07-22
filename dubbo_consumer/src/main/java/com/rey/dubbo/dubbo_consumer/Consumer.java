package com.rey.dubbo.dubbo_consumer;

import java.util.List;  

import org.springframework.context.support.ClassPathXmlApplicationContext;  

import com.rey.dubbo.dubbo_provider.User;
import com.rey.dubbo.dubbo_provider.service.DemoService;
  
  
public class Consumer {  
  
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "dubbo-consumer.xml" });  
        context.start();  
  
        DemoService demoService = (DemoService) context.getBean("demoService"); //  
        String hello = demoService.sayHello("tom"); // ִ  
        System.out.println(hello); //   
  
        //   
        List<User> list = demoService.getUsers();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println(list.get(i));  
            }  
        }  
        System.in.read();  
    }  
  
}  