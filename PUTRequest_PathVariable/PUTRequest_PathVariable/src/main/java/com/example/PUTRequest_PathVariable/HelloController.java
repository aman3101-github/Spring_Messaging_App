package com.example.PUTRequest_PathVariable;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // PUT request with firstName as Path Variable and lastName as Query Parameter
    @PutMapping("/put/{firstName}")
    public String updateGreeting(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }   
}
