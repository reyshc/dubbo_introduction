package com.rey.dubbo.dubbo_provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class Provider {  
   
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider.xml"});  
        context.start();  
        System.out.println("�����Ѿ�����...");
        System.in.read(); // Ϊ��֤����һֱ���ţ�������������������ģ��  
    }  
} 