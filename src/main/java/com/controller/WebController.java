package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/web")
public class WebController {
    @ResponseBody
    @RequestMapping(value = "test",method = RequestMethod.POST)
    public Object test(){
        List<String> list = new ArrayList<String>() ;
        list.add("222");
        list.add("2ew2322");
        list.add("22234ds");

        return list;
    }
}
