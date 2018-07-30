package com.mycrazycodes.springboot.firstservice;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FirstController {

    @Value("${spring.application.name} - ${service.instance.name}")
    private String instanceInfo;

    @RequestMapping("/info")
    public String instanceInfo(){
        return instanceInfo;
    }
}
