package com.training.shootinggame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/api")
@RestController
public class ShootingController {
    @Autowired
    private ShootingService shootingService;

    @GetMapping("/getHeroHealth")
    public int getHealthOfHero(){
        return shootingService.getHeroHealth();
    }
}
