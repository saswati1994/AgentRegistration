package com.test.AgentRegistration.Controller;

import com.test.AgentRegistration.Entity.LoginForm;
import com.test.AgentRegistration.Entity.RegistrationForm;
import com.test.AgentRegistration.Repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {
    @Autowired
    RegistrationRepository registrationRepository;
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegistrationForm(){
        return "registration";
    }
    @RequestMapping(value = "/registration",method = RequestMethod.POST)
    public String registerAgent(@ModelAttribute(name="RegistrationForm") RegistrationForm registrationForm, Model model){

        registrationRepository.save(registrationForm);
        return "success";
    }
}
