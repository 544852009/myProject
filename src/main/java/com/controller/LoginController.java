package com.controller;

import com.entity.Userinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.xml.registry.infomodel.User;

@Controller
@RequestMapping(value = "/my", method = RequestMethod.GET)
public class LoginController {

    @RequestMapping(value = "/index")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String printHello(@Valid Userinfo userinfo, BindingResult bingingresult , HttpServletRequest request, HttpServletResponse response, Model model) {
        if(bingingresult.hasErrors()){
            System.out.println(bingingresult.getModel());
        }
        String  ss = userinfo.getUsername();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        return "success";
    }
}
