package com.example.demo.controller;

import org.hibernate.engine.spi.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.enity.Userrepository;
import com.example.demo.models.User;

@Api(tags = "用户")
@RestController
@RequestMapping(value = "/user")
public class UserController {
  @Autowired
  private Userrepository userRepository;

  @ApiOperation("查询用户")
  @GetMapping(value = "/list")
  public @ResponseBody Iterable<User> list() {
    return userRepository.findAll();
  }

  @ApiOperation("通过id查询用户")
  @GetMapping(value = "/getUserById")
  public @ResponseBody Iterable<User> getUserById(Long id) {
    return userRepository.getUserById(id);
  }

  @ApiOperation("添加用户")
  @PostMapping(value = "/add")
  public String add(@RequestParam(value = "name", required = true) String name,
      @RequestParam(value = "password", required = true) String password) {
    User n = new User();
    n.setUserName(name);
    n.setPassWord(password);
    userRepository.save(n);
    return "success";
  }

  @ApiOperation("修改用户")
  @PutMapping(value = "/update")
  public String update(@RequestBody User user) {
    userRepository.save(user);
    return "success";
  }

  @ApiOperation("删除用户")
  @DeleteMapping(value = "/delete")
  public String delete(@RequestParam(value = "id", required = true) Long id) {
    userRepository.deleteById(id);
    return "success";
  }

}
