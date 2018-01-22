package com.controller;

import com.common.BaseController;
import com.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/my")
public class LoginController extends BaseController{

    @RequestMapping(value = "/index")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String printHello(UserInfo userinfo, HttpServletRequest request, RedirectAttributes redirectAttributes, HttpServletResponse response, Model model) {

        if("".equals(userinfo.getUserName())||userinfo.getUserName()==null){
            addMessage(redirectAttributes,"用户名不能为空");
            return "redirect:/my/index";
        }
        if("".equals(userinfo.getPassword())||userinfo.getPassword()==null){
            addMessage(redirectAttributes,"密码不能为空");
            return "redirect:/my/index";
        }
        request.getSession().setAttribute("user",userinfo);
        return "success";
    }


    @RequestMapping(value = "/logOut")
    public String logOut( HttpServletRequest request, RedirectAttributes redirectAttributes, HttpServletResponse response, Model model) {
        HttpSession httpSession = request.getSession();
        httpSession.removeAttribute("user");
        addMessage(redirectAttributes,"注销成功.");
        return "redirect:/my/index";
    }

}
