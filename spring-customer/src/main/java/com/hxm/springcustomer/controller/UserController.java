package com.hxm.springcustomer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XAIOHU
 * @date 2019/9/27 --11:29
 **/
@RestController
public class UserController{
     @GetMapping("/buy")
    public  String Ticket(String name){
         return name+"购买了"+"";
     }



}
