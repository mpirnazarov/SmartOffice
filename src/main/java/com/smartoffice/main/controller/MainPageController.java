package com.smartoffice.main.controller;

import com.smartoffice.hr.model.Users;
import com.smartoffice.hr.service.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by Muslimbek on 4/20/2017.
 */
@Controller
@SessionAttributes("users")
public class MainPageController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/")
    public ModelAndView visitHome() {
        Users users = new Users();
        users.setUsername("muslimbek");
        users.setBirthPlace("Tashkent");
        users.setEmailCompany("muslimbek.pirnazarov@gmail.com");
        usersService.insertUser(users);
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/admin")
    public String WelcomePage2(Principal principal){

        System.out.println(usersService.getAllUsers());

        return "redirect: /User/Profile2";
    }


}
