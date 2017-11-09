package hello.service;

import hello.model.Address;
import hello.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BeerService {


    @Autowired
    RestTemplate restTemplate;

    public Beer getBeer() {
        return restTemplate.getForObject(
                "http://api.brewerydb.com/v2/beer/random?key=<e04176f66e6b8dda1f4e78e0effdc7b4>", Beer.class);

    }


    public Address getAdress(){
        return restTemplate.getForObject(
                "https://maps.googleapis.com/maps/api/geocode/json?address=100+Ocean+Drive,+Dennis,+MA&key=AIzaSyARonlggObkzsDadTgZClAenkWFmdVfXPM",
                Address.class);

    }

}
