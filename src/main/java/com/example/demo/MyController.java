package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuwei
 * @title: MyController
 * @description:
 * @date 2019/12/19 16:44
 */
@RestController
public class MyController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }


}
