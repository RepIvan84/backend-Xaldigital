package com.xaldigital.retojava.restapi.jsonapi.utils;

import com.google.gson.Gson;
import com.xaldigital.retojava.restapi.jsonapi.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestConsumer {

   // @Value("${api.url}")
    //private String url_api;

    private final String URL_API="https://api.stackexchange.com/2.2/search?order=desc&sort=activity&intitle=perl&site=stackoverflow";
    @Autowired
    RestTemplate restTemplate;

    public Consumer getConsumerData() {

        Consumer consumer = new Consumer();
        Gson gson = new Gson();


        String consumerStr = restTemplate
                .getForObject(
                        URL_API,
                        String.class);

        consumer = gson.fromJson(consumerStr, Consumer.class);
        return consumer;
    }


}
