package com.weijinhui.pandabook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: pandabook
 *
 * @description:
 *
 * @author: Carson Wei
 *
 * @create: 2020-05-28 16:13
 **/
@Controller
public class IndexController {

    @GetMapping(value = "/index")
    public String index(Model model){
       System.out.println("index");
        return  "index";
    }


}
