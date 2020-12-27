package com.api.usermanagement.usermanagement.controllers;


import com.api.usermanagement.usermanagement.entities.UserEntity;
import com.api.usermanagement.usermanagement.services.UserService2;
import com.api.usermanagement.usermanagement.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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
    @PostMapping(value="/signIn",consumes="Application/json,Application/xml")
    public ResponseEntity<String> signInUser(@RequestBody UserEntity user) {

        ResponseEntity response=
      return new ResponseEntity(userService.loginCheck( user.getEmail(),user.getPassword() ), HttpStatus.OK);

    }

    @PostMapping(value="/register",consumes="Application/json,Application/xml")
    public  ResponseEntity<String> saveUser(@RequestBody UserEntity user) {

          return user!=null ?
                        new ResponseEntity(userService.saveUser(user),HttpStatus.CREATED)
                      : (new ResponseEntity(user,HttpStatus.BAD_REQUEST);
    }

    @PostMapping(value="/forgotPassword",consumes="Application/json,Application/xml")
    public  ResponseEntity<String> forgotPass(@RequestBody UserEntity user) {
        return new ResponseEntity( userService.forgotPassword(user.getEmail()),HttpStatus.OK);
    }

    @PostMapping(value="/unlockAccount",consumes="Application/json,Application/xml")
    public  ResponseEntity<String> forgotPass(@RequestBody UserEntity user) {
        userService.unlockAccount(user.)
    }
}