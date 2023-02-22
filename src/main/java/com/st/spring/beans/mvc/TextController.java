package com.st.spring.beans.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class TextController {

    @GetMapping("/hello")
    public String hello() {
        return "hello word";
    }
}
