package com.aston.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WaterReservoirHomeController {
    @RequestMapping
    public String form() {
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact-us";
    }

    @RequestMapping("/report")
    public String report() {
        return "report-incident";
    }

    @RequestMapping("/legend")
    public String legend() {
        return "legend";
    }

    @RequestMapping("/success")
    public String success() {
        return "success";
    }
}
