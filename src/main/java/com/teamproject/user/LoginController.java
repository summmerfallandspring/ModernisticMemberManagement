package com.teamproject.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class LoginController
{
    @RequestMapping(value = "")
    public String welcome() { return "index"; }

    @RequestMapping(value = "login")
    public String login() { return "login"; }

    @RequestMapping(value = "register")
    public String register() { return "register"; }
}
