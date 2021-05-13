package com.test.demo.Service;

import com.test.demo.Bean.User;

public interface UserService {

    public String Login(String username, String password);
    public void Logout();
    public void ChangeRole();
    public void CreatUser();
    public void DeleteUser();
    public void Signup(User user);
}
