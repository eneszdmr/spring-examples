package com.latestdevelopers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pet")
@Api(value = "benim api dökümantasyonum controller içirisinde")
public class PetController {

    private List<Pet> petList = new ArrayList<>();

    @PostConstruct
    public void init() {
        petList.add(new Pet(1, "kurbaga", new Date()));
    }

    @PostMapping
    @ApiOperation(value = "post metodu burası", notes = "dikkatli ol")
    public ResponseEntity<Pet> kaydet(@RequestBody @ApiParam(value = "hayvans") Pet pet) {
        return ResponseEntity.ok((pet));
    }

    @GetMapping
    @ApiOperation(value = "pet listesi metodu", notes = "tümünü getirir")
    public ResponseEntity<List<Pet>> tumunuListele() {
        return ResponseEntity.ok(petList);
    }


}
