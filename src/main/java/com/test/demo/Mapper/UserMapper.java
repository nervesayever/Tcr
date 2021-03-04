package com.test.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public String Login(String username, String password);
    public void Logout(String username);
    //It's so fucking boring,I am gonna leaving
}
