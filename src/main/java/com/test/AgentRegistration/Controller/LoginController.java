package com.test.AgentRegistration.Controller;

import com.test.AgentRegistration.Entity.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
 public String getLoginForm(){
     return "login";
 }
 @RequestMapping(value = "/login",method = RequestMethod.POST)
 public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model) {
     String username = loginForm.getUsername();
     String password = loginForm.getPassword();
     if ("admin".equals(username) && "admin".equals(password)) {
         return "home";
     }
     model.addAttribute("invalidCredential",true);
             return "login";
 }
}

