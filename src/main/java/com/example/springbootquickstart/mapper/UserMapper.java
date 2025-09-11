package com.example.springbootquickstart.mapper;

import com.example.springbootquickstart.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username}")
    public User findByUserName(String username);

    @Insert("insert into user(username,password,create_time,update_time)"+
    " values(#{username},#{password},now(),now())")
    public void add(String username, String password);
}
