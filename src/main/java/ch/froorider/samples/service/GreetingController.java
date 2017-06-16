package ch.froorider.samples.service;


import ch.froorider.samples.domain.Greeting;
import ch.froorider.samples.domain.Tron;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong; 

@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!"; 
    private final AtomicLong counter = new AtomicLong(); 

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public @ResponseBody Greeting greeting(@RequestParam(value = "name", defaultValue = "Stranger")String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name)); 
    }

    @RequestMapping(value = "/tron", method = RequestMethod.GET)
    public @ResponseBody Tron getTron() {
        return new Tron(); 
    }
}