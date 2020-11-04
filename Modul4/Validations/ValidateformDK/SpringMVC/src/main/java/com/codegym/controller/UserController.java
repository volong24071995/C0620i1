package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("index");
        Iterable<User> users=userService.findAll();
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView view(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("view");
        User user=userService.findOne(id);
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        User user=userService.findOne(id);
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @PostMapping("/update-user")
    public ModelAndView update(@Validated @ModelAttribute("user") User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("edit");
        user.validate(user, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return modelAndView;
        }
        userService.save(user);
        modelAndView.addObject("user", user);
        modelAndView.addObject("cmt", "User updated!");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        userService.remove(id);
        return "redirect:/user";
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView=new ModelAndView("create");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView save(@Validated @ModelAttribute("user") User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("create");

        user.validate(user, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return modelAndView;
        }
        userService.save(user);
        modelAndView.addObject("user",new User());
        modelAndView.addObject("cmt", "User created!");
        return modelAndView;
    }


//    @PostMapping("/validateUser")
//    public ModelAndView checkValidation(@Validated @ModelAttribute("user") User user, BindingResult bindingResult) {
//        if (bindingResult.hasFieldErrors()) {
//            ModelAndView modelAndView = new ModelAndView("index");
//            return modelAndView;
//        }
//        ModelAndView modelAndView = new ModelAndView("result");
//        return modelAndView;
//    }

}