package com.backend.fabrica.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Democontroller {

    @GetMapping("/handler")
    public String handler(){
        return "from democontroller/handler";
    }
}
