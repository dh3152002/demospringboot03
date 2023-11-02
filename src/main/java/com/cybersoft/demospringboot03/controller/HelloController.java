package com.cybersoft.demospringboot03.controller;/*
    @Controller: dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra html
    @ResponseBody: giúp @Controller có thể trả ra kiểu String dùng để viết API

    @RestController: là sự kết hợp của @Controller và @ResponseBody => viết API
 */

import com.cybersoft.demospringboot03.payload.request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Tham số truyền trên trình duyệt: @RequestParam
    // Tham số truyền ngầm: @RequestParam
    // Tham số đóng vai trò như 1 đường dẫn: @PathVariable
    // Tham số truyền ngầm là đối tượng: @RequestBody

    // form-data: có hỗ trợ truyền file
    // form-urlencoded: ko hỗ trợ truyền file
    // raw: hỗ trợ truyền lên 1 đối tượng

    @GetMapping("")
    public String hello(@RequestParam String hoten,@RequestParam int tuoi){
        return "Hello spring boot " +hoten+" - "+tuoi;
    }

    @PostMapping("/cybersoft")
    public String helloCyberSoft(@RequestBody LoginRequest loginRequest){
        return "Hello cybersoft "+loginRequest.getUsername()+" - "+loginRequest.getPassword();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id) {
        return new ResponseEntity<>("update " + id, HttpStatus.OK);
    }
}
