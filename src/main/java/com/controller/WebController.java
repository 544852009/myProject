package com.controller;

import com.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/web")
public class WebController {

    @ResponseBody
    @RequestMapping(value = "test",method = RequestMethod.POST)
    public Object test(HttpServletRequest request, RedirectAttributes redirectAttributes, HttpServletResponse response, Model model){
        String a = request.getParameter("d");
        List<UserInfo> infos = new ArrayList<UserInfo>();
        infos.add(new UserInfo("e","4"));
        infos.add(new UserInfo("e","4"));
        infos.add(new UserInfo("e","4"));
        infos.add(new UserInfo("e","4"));
        Map map = new HashMap();
        map.put("list",infos) ;
        return map;

    }
}
