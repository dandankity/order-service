package com.dmall.orderservice.adapter.apis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageController {

    @Value("${message:Hello world - Config Server is not working..pelase check}")
    private String message;

    @RequestMapping("/message")
    String getMsg() {
        return this.message;
    }
}
