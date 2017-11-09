package hello.controllers;

import hello.model.FarmLand;
import hello.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmController {

    @Autowired
    FarmService service;



    @RequestMapping("/makenew/Land")
    public FarmLand makenewLand(@RequestParam("animals")int animals,
                                @RequestParam("crops") int crops) {
        return service.makenewLand(animals, crops);

    }


}





