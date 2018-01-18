package com.controller;

import com.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/my", method = RequestMethod.GET)
public class LoginController {

    @RequestMapping(value = "/index")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String printHello(@Valid UserInfo userinfo, BindingResult result, HttpServletRequest request, HttpServletResponse response, Model model) {

        if(result.hashCode()!=0){
            System.out.println("22");
        }
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        model.addAttribute("a","dd");
        model.addAttribute("list",list);
        return "success";
    }
}
