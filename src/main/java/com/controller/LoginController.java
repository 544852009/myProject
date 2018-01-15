package com.controller;

import com.google.gson.JsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/my", method = RequestMethod.GET)
public class LoginController {

    @RequestMapping(value = "/index")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String printHello(HttpServletRequest request, HttpServletResponse response, Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        return "success";
    }
    JsonParser jsonParser = new JsonParser();
}
