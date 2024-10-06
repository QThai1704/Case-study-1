package com.nqt.cs1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @GetMapping(value = "/")
    public String homePage() {
        return "admin/homepage/show";
    }
}
