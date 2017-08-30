package com.anderscore.service.greeting.rest;

import com.anderscore.service.greeting.client.TimerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeter {

    @Autowired
    private TimerClient timerClient;

    @RequestMapping("/")
    public String sayHello(){
        return String.format("Hello - it is: %s",timerClient.getTime());
    }
}
