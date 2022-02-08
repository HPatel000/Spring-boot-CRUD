package com.user.management.ums.User;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/users")
  public ModelAndView listUsers() {
    ModelAndView mv = new ModelAndView();
    mv.addObject("users", userService.getAllUsers());
    mv.setViewName("users");

    return mv;
  }

  @GetMapping("/adduser")
  public ModelAndView addUserForm() {
    ModelAndView mv = new ModelAndView();

    // create user object to hold user form data
    User user = new User();

    mv.addObject("user", user);
    mv.setViewName("userForm");
    return mv;
  }
  
  @PostMapping(value="/users")
  public ModelAndView addNewUser(@ModelAttribute("user") User user) {

    userService.saveUser(user);

    ModelAndView mv = new ModelAndView("redirect:/users");
      
      return mv;
  }
  
  
  
}
