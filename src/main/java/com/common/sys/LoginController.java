package com.common.sys;

import com.common.BaseController;
import com.modules.user.dao.UserinfoMapper;
import com.modules.user.entity.Userinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/my")
public class LoginController extends BaseController{

    @Resource
    private UserinfoMapper userinfoMapper ;

    @RequestMapping(value = "/index")
    public String login(HttpServletRequest request ,HttpServletResponse response ,Model model) {
        request.setAttribute("language",request.getParameter("language"));
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String printHello(Userinfo userinfo, HttpServletRequest request, RedirectAttributes redirectAttributes, HttpServletResponse response, Model model) {

        if("".equals(userinfo.getUserName())||userinfo.getUserName()==null){
            addMessage(redirectAttributes,"用户名不能为空");
            return "redirect:/my/index";
        }
        if("".equals(userinfo.getPassword())||userinfo.getPassword()==null){
            addMessage(redirectAttributes,"密码不能为空");
            return "redirect:/my/index";
        }

        model.addAttribute("user",new Userinfo("2","3"));

        request.getSession().setAttribute("user",userinfo);
        return "success";
    }

    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String register(HttpServletRequest request ,HttpServletResponse response ,Model model){
        return "register";
    }


    @RequestMapping(value = "logOut")
    public String logOut( HttpServletRequest request, RedirectAttributes redirectAttributes, HttpServletResponse response, Model model) {
        HttpSession httpSession = request.getSession();
        httpSession.removeAttribute("user");
        addMessage(redirectAttributes,"注销成功.");
        return "redirect:/my/index";
    }

}
