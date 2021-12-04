package com.openlab.controller;


import com.openlab.pojo.Users;
import com.openlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/UsersMybatis")
public class UsersControllerMybatis {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public List<Users> getUsersList(){
        return userService.getUsersList();
    }

    @PostMapping("/")
    public String addUsers(Users users){
        userService.addUsers(users);
        return "success";
    }

    //查询指定Id用户
    @GetMapping("/{id}")
    public Users getUsersById(@PathVariable("id") Long id){

        System.out.println(id);
        return userService.findUsersByUsersId(id);
    }

    //修改指定用户Id
    @PutMapping("/{id}")
    public String updateUserById(@PathVariable("id") Long id,Users users){
        userService.updateUsers(id,users);
        return "success";
    }

    //删除指定用户的Id
    @DeleteMapping("/{id}")
    public String deleteByUserId(@PathVariable("id") Long id){
        userService.deleteUsersById(id);
        return "success";
    }

}
