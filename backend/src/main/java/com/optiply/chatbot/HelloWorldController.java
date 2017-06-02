package com.optiply.chatbot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @RequestMapping(value = "")
    public String helloWorld()
    {
        return "Hello world!";
    }
}
