package com.common.sys;

import com.common.BaseController;
import com.modules.user.entity.UserInfo;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
@RequestMapping(value = "/my")
public class LoginController extends BaseController {
    @RequestMapping(value = "/index")
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
        request.setAttribute("language", request.getParameter("language"));
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String printHello(@Validated UserInfo userinfo, BindingResult br, HttpServletRequest request, RedirectAttributes redirectAttributes, HttpServletResponse response, Model model) {
        String a = userinfo.getUsername();
        /**
         * hibernate validator没起作用。
         */
        if (br.hasErrors()) {
            System.out.println("222");
        }
        if ("".equals(userinfo.getUsername()) || userinfo.getUsername() == null) {
            addMessage(redirectAttributes, "用户名不能为空");
            return "redirect:/my/index";
        }
        if ("".equals(userinfo.getPassword()) || userinfo.getPassword() == null) {
            addMessage(redirectAttributes, "密码不能为空");
            return "redirect:/my/index";
        }

        request.getSession().setAttribute("user", userinfo);
        return "success";
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(HttpServletRequest request, HttpServletResponse response, Model model) {
        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String postRegister(HttpServletRequest request, HttpServletResponse response, Model model) {

        return "register";
    }


    @RequestMapping(value = "logOut")
    public String logOut(HttpServletRequest request, RedirectAttributes redirectAttributes, HttpServletResponse response, Model model) {
        HttpSession httpSession = request.getSession();
        httpSession.removeAttribute("user");
        addMessage(redirectAttributes, "注销成功.");
        return "redirect:/my/index";
    }

    @RequestMapping(value = "language")
    public String language(HttpServletRequest request, HttpServletResponse response) {
        String langType = request.getParameter("lang");
        if (langType == null || langType.equals("")) {
            return "forward:index";
        } else {
            if (langType.equals("zh_CN")) {
                Locale locale1 = new Locale("zh", "CN");
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale1);
            } else if (langType.equals("en_US")) {
                Locale locale1 = new Locale("en", "US");
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale1);
            } else {
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, LocaleContextHolder.getLocale());
            }
        }

        return "forward:index";
    }

}
