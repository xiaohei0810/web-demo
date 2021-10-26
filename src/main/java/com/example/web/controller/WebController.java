package com.example.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/26 4:51 下午
 * @Version 1.0
 * @Describtion
 */
@RestController
public class WebController {

    @GetMapping("/demo")
    public String demo(){
        return new Random().nextInt(100)+"";
    }

}
