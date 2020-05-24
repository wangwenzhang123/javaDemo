package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET,produces="text/plain;charset=UTF-8")
    public String hello(@RequestParam(value = "userName") String userName){

        return "我 的第一个Java后台"+userName;
    }
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public String getList(@RequestParam(value = "userId") String data){

        return "我 的第一个Java后台"+data;
    }
    @RequestMapping(value = "/getUpload",method = RequestMethod.POST)
    public String getUpload(@RequestBody String data){

        return "我 的第一个Java后台"+data;
    }
}
