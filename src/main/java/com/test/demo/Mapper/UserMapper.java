package com.test.demo.Mapper;

import com.test.demo.Bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public String Login(String username, String password);
    public void Logout(String username);
    public void addUser(User user);
}
