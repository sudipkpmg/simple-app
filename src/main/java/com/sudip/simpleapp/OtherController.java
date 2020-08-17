package com.sudip.simpleapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

@Controller
public class OtherController {

    @RequestMapping(value = "/sayHello")
    public ResponseEntity<String> sayHello() {
        String msg = "Hello, Sudip";

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

}
