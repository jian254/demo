package com.jian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jian on 17/7/28.
 */
@Controller
@RequestMapping(value = "")
public class MainController {
    @RequestMapping("")
    public String index() {
        return "index";
    }
}
