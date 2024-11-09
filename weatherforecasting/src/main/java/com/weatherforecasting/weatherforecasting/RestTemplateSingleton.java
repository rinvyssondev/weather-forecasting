package com.weatherforecasting.weatherforecasting;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateSingleton {
    private static final RestTemplate instance = new RestTemplate();

    private RestTemplateSingleton() {}

    public static RestTemplate getInstance(){
        return instance;
    }
}
