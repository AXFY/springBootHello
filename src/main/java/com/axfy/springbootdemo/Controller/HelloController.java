package com.axfy.springbootdemo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AXFY
 * @date 2020/11/5 9:37
 */
@RestController
@PropertySource("classpath:application-test.yml")
public class HelloController {
    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    @RequestMapping("/hello")
    public String getHello(){
        return "姓名为"+name+",年级为"+age;
    }
}
