package com.example.SpringSecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String get(HttpServletRequest req){
        System.out.println("sessionID:"+req.getSession().getId());
        return "sessionID:"+req.getSession().getId();
    }
}
