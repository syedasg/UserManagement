package com.api.usermanagement.usermanagement.controllers;


import com.api.usermanagement.usermanagement.entities.UserEntity;
import com.api.usermanagement.usermanagement.services.UserService2;
import com.api.usermanagement.usermanagement.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//@RequestMapping("/user")
public class UserManagementController {

    @Autowired
    UserService2 userService;

    /*
        @GetMapping("/loadRegForm")
        public String loadForm(Model model) {
            model.addAttribute("user", new UserEntity());
            model.addAttribute("genders", userService.getGenders());
            model.addAttribute("countries", userService.getCountries());
            model.addAttribute("states", userService.getStates());
            model.addAttribute("cities", userService.getCities());
            return "userRegistration";
        }

        @PostMapping("/register")
        public String saveUser(UserEntity entity,Model model) {

            System.out.println(entity);
            userService.signup(entity);
            model.addAttribute("user", entity);
            //model.addAttribute("genders", userService.getGenders());
           // model.addAttribute("countries", userService.getCountries());
           // model.addAttribute("states", userService.getStates());
           // model.addAttribute("cities", userService.getCities());
            return "userData";
        }

        @GetMapping("/loadSignIn")
        public String signIn(Model model){
            model.addAttribute("user", new UserEntity());
            return "userSignIn";
        }

        @PostMapping("/signIn")
        public String signInUser(UserEntity entity,Model model) {

            System.out.println(entity);
            //userService.signIn(entity);
            model.addAttribute("user", entity);
            //model.addAttribute("genders", userService.getGenders());
            // model.addAttribute("countries", userService.getCountries());
            // model.addAttribute("states", userService.getStates());
            // model.addAttribute("cities", userService.getCities());
            return "userData";
        }

    */
    @PostMapping("/signIn")
    public String signInUser(UserEntity entity, Model model) {

    }
}