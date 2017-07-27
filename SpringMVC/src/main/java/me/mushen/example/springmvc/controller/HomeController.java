package me.mushen.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Desc
 * @Author Remilia
 * @Create 2017-07-27
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/spittles", method = RequestMethod.GET)
    public String spittles(){
        return "spittles";
    }
}
