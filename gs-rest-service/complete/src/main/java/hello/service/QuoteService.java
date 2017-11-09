package hello.service;

import hello.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
    public class QuoteService {

        @Autowired
        RestTemplate restTemplate;

        public Quote getQuote(){
            return restTemplate.getForObject(
                    "http://gturnquist-quoters.cfapps.io/api/random", Quote.class);

    }
}
