package com.latestdevelopers.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/mesaj")
public class RestClientController {

    public static final  String webUrl="http://localhost:8080/kisi";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<ResponseEntity> getKisiListesi() {
    return restTemplate.getForEntity(webUrl,ResponseEntity.class);
    }
}
