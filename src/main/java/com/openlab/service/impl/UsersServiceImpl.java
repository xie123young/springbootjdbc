package com.openlab.service.impl;

import com.openlab.dao.UserDao;
import com.openlab.pojo.Users;
import com.openlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserDao userDao;


    @Override
    public List<Users> getUsersList() {
        //return jdbcTemplate.query("select * from users",new BeanPropertyRowMapper<>(Users.class));
        return userDao.getAll();
    }

    @Override
    public Users findUsersByUsersId(Long id) {
        //return jdbcTemplate.queryForObject("select * from users where id=?",new BeanPropertyRowMapper<>(Users.class),id);
        return userDao.findOne(id);
    }

    @Override
    public void addUsers(Users users) {
        //jdbcTemplate.update("insert into users(name,age) values (?,?)",users.getName(),users.getAge());
        userDao.save(users);
    }

    @Override
    public void updateUsers(Long id, Users users) {
        //jdbcTemplate.update("update users set name=?,age=? where id=?",users.getName(),users.getAge(),id);
        users.setId(id);
        userDao.modifyUsers(users);
    }

    @Override
    public void deleteUsersById(Long id) {

        //jdbcTemplate.update("delete from users where id=?",id);
        userDao.deleteUsersById(id);
    }
}
