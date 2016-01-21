package pl.pogos.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sebastian on 21.01.2016.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "Greetings from Spring Boot!";
    }

}
