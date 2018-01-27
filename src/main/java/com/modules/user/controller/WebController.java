package com.modules.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/web")
public class WebController {

    @ResponseBody
    @RequestMapping(value = "test",method = RequestMethod.POST)
    public Object test(HttpServletRequest request, RedirectAttributes redirectAttributes, HttpServletResponse response, Model model){
        String a = request.getParameter("d");
//        List<Userinfo> infos = new ArrayList<Userinfo>();
//        infos.add(new Userinfo("e","4"));
//        infos.add(new Userinfo("e","4"));
//        infos.add(new Userinfo("e","4"));
//        infos.add(new Userinfo("e","4"));
        Map map = new HashMap();
        return map;

    }
}
