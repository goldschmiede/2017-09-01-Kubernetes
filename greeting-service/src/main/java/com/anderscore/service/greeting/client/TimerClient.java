package com.anderscore.service.greeting.client;

import org.apache.http.client.fluent.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class TimerClient {

    Logger logger = LoggerFactory.getLogger(TimerClient.class);

    @Value("${timeserver.url}")
    private String url;

    public String getTime(){
        String value = null;
        try {
            return Request.Get(url).execute().returnContent().asString();
        } catch (Exception e) {
            logger.error("oops", e);
        }
        return value;
    }

}
