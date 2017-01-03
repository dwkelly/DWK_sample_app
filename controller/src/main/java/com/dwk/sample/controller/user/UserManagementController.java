package com.dwk.sample.controller.user;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.dwk.sample.controller.model.AppUser;

@Controller
@RequestMapping(value = "users")
public class UserManagementController {

    RestTemplate template = new RestTemplate();

    @RequestMapping(value = "/helloDetroit", method = RequestMethod.GET)
    public ModelAndView helloDetroit() {
        final ModelAndView view = new ModelAndView("HelloDetroit");
        return view;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView getPage() {
        final List<AppUser> list =template.getForObject("http://localhost:8080/user-management-business-logic/webresources/user/getAllUsers",
                List.class);
        final ModelAndView view = new ModelAndView("home");
        view.addObject("userList", list);
        return view;
    }

}
