package me.jiangyu.webapp.web.controller.account;

import me.jiangyu.webapp.domain.User;
import me.jiangyu.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jiangyukun on 2014/11/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(User user) {
        userService.saveUser(user);
        return "redirect:/user/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "/user/login";
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String userLogin(String mobile, String password, Model model) {
        if (userService.loginByMobile(mobile, password)) {
            model.addAttribute(AccountUtils.ID_STRING, mobile);
            return "redirect:/index";
        }
        model.addAttribute("info", "登录失败");
        return "redirect:/user/login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "/user/register";
    }
}
