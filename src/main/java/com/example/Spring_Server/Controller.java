package com.example.Spring_Server;

import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.util.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Arun Gupta
 */
@RestController
public class Controller {

    @CrossOrigin(origins = "https://client-side-react.herokuapp.com")
    @RequestMapping("/getUserData")
    public String userData() throws IOException{
        String fileName = "static/sample.txt";
        ClassLoader classLoader = getClass().getClassLoader();
        String result = "";
        try (InputStream inputStream = classLoader.getResourceAsStream(fileName)) {
            result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
