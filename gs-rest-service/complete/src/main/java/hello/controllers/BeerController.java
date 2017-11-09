package hello.controllers;

import hello.model.Address;
import hello.model.Beer;
import hello.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeerController {



        @Autowired
        BeerService service;

        @RequestMapping("/beer")
        public Beer getBeer(){
            return service.getBeer();
        }


        @RequestMapping("/address")
        public Address getAddress(){
            return service.getAdress();


        }

    }
