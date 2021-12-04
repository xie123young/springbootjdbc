package com.openlab.service;

import com.openlab.pojo.Users;

import java.util.List;

public interface UserService {

    public List<Users> getUsersList();
    public Users findUsersByUsersId(Long id);
    public void addUsers(Users users);
    public void updateUsers(Long id,Users users);
    public void deleteUsersById(Long id);
    public void pay(String out_trand_id);
}
