package hello.controllers;

import hello.model.Quote;
import hello.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class QuoteController {

   @Autowired
   QuoteService service;

   @RequestMapping("/quote")
    public Quote getQuote(){
       return service.getQuote();
   }

}
