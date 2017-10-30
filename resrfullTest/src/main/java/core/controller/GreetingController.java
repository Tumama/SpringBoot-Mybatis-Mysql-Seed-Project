package core.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import core.model.Greeting;

//http://localhost:8080/SampleProject/api/cars/find 

@RestController
@RequestMapping("/v1/greeting")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping(value="", method=RequestMethod.GET) 
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

//    @RequestMapping(value="", method=RequestMethod.GET) 
//    public String greeting() {
//    	   return "hello world";
//    }
//    
    
    
    @RequestMapping("/find")
    public String findCars() {
        // 回傳 Cars JSONArray
        return "[{\"id\":1,\"model\":\"P...\"}]";
    }
}
