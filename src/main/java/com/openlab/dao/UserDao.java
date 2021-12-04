package com.openlab.dao;


import com.openlab.pojo.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from users")
    public List<Users> getAll();

    @Select("select * from users where id=#{id}")
    public Users findOne(Long id);
    @Insert("insert into users(name,age)values(#{name},#{age})")
    public void save(Users users);

    @Update("update users set name=#{name} ,age=#{age} where id=#{id}")
    public void modifyUsers(Users users);

    @Delete("delete from users where id=#{id}")
    public void deleteUsersById(Long id);

}
