package ru.cules08.crud.PP_311.crud2Boot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.cules08.crud.PP_311.crud2Boot.models.User;
import ru.cules08.crud.PP_311.crud2Boot.service.UserService;

import java.util.List;


@Controller
public class UsersController {
    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String print(ModelMap model) {
        List<User> list = userService.getAllUsers();
        model.addAttribute("users", list);
        return "users";
    }


    @GetMapping(value = "/new")
    public String newUser(ModelMap model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping(value = "/users")
    public String saveNewUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping(value = "edit/{id}")
    public String edit(@PathVariable("id") int id,Model model) {
        model.addAttribute("user", userService.findById(id));
        return "edit";
    }

    @PostMapping(value = "/edit")
    public String update(int id,User user) {
        userService.update(id,user);
        return "redirect:/";
    }

    @GetMapping(value = "delete/{id}")
    public String delete(@PathVariable("id") int id) {
        userService.delete(id);
        return "redirect:/";
    }

}
