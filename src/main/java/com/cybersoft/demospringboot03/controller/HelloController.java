package com.cybersoft.demospringboot03.controller;

/*
    @Controller: dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra html
    @ResponseBody: giúp @Controller có thể trả ra kiểu String dùng để viết API

    @RestController: là sự kết hợp của @Controller và @ResponseBody => viết API
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello(){
        return "Hello spring boot";
    }

    @GetMapping("/cybersoft")
    public String helloCyberSoft(){
        return "Hello cybersoft";
    }
}
