package com.test.demo.Controller;


import com.test.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("/Login")
    @ResponseBody
    public void Login(String username,String password)
    {
        userservice.Login(username,password);
    }


}
