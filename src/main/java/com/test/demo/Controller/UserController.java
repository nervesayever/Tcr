package com.test.demo.Controller;


import com.test.demo.Bean.User;
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
    public String Login(String username,String password)
    {
        if(userservice.Login(username,password)!=null)
            return "success";
       else return "error";
    }

    @GetMapping("Signup")
    @ResponseBody
    public void Signup(User user){
        userservice.Signup(user);
    }

    @GetMapping("Logout")
    @ResponseBody
    public String Logout(){
        return "a";
    }


}
