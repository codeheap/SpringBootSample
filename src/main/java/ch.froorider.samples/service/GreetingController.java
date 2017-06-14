package ch.froorider.samples.service;

import ch.froorider.samples.domain.*;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController{
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping(value="/greeting",method=RequestMethod.GET)
    public @ResponseBody Greeting greeting(@RequestParam(value="name", defaultValue="Stranger") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }
    
    @RequestMapping(value="/")
    public @ResponseBody String getHomePage(){
        return "index";
    }

    @RequestMapping(value="/tron")
    public @ResponseBody Tron getTron(){
        return new Tron();
    }
}