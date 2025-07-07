package com.debug_app.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
    @GetMapping("/about")
    public String getAbout(){
        String str="My Name is Mahesh";
        str=str.toLowerCase();
        str=str.toUpperCase();
        return str;
    }
}
