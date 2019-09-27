package com.hxm.eurakeservice.controller;


import com.hxm.eurakeservice.server.MyServer;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XAIOHU
 * @date 2019/9/27 --11:07
 **/
@RestController
public class MyController {

    @Autowired
    MyServer myserver;


    @GetMapping("/mapping")
    public String getMapping(){
        String ticker = myserver.getTicker();

        return ticker;
    }

}
