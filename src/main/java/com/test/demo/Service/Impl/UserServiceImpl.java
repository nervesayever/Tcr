package com.test.demo.Service.Impl;


import com.test.demo.Bean.User;
import com.test.demo.Mapper.UserMapper;
import com.test.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("UserService")
@Transactional(rollbackFor = {Exception.class})
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public String Login(String username, String password) {
        return userMapper.Login(username,password);
    }

    @Override
    public void Logout() {

    }

    @Override
    public void ChangeRole() {

    }

    @Override
    public void CreatUser() {

    }

    @Override
    public void DeleteUser() {

    }

    @Override
    public void Signup(User user) {
        userMapper.Signup(user);
    }


}
