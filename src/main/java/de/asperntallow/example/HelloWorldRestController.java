package de.asperntallow.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam("name") String name) {
        return String.format("Hello, %s!", name);
    }

}
