package pl.pogos.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pogos.sample.sign.SignService;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Sebastian on 21.01.2016.
 */
@RestController
public class MainController {

    @Autowired
    private SignService signService;

    @RequestMapping("/")
    public String home() throws NoSuchAlgorithmException {
        KeyPair keyPair = signService.generateKeyPair();


        return "Public key: " + signService.getKey(keyPair.getPublic());
    }

}
