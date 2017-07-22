package com.rey.dubbo.dubbo_provider.service;

import java.util.List;  

import com.rey.dubbo.dubbo_provider.User;



public interface DemoService {  
  
    String sayHello(String name);  
  
    public List<User> getUsers();  
  
}