package dev.guipalazzo.springmvcalbertosouza.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String index() {
        System.out.println("Loading the home page");
        return "hello-world";
    }
}