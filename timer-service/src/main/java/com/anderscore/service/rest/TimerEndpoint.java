package com.anderscore.service.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TimerEndpoint {

    @RequestMapping("/")
    public String getTime(){
        return (new Date()).toString();
    }
}
