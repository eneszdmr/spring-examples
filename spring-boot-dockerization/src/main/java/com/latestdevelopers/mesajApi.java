package com.latestdevelopers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mesaj")
public class mesajApi {

    @GetMapping
    public String mesajVer(){
        return "Docker Container içinden mesaj geldi";
    }

}
