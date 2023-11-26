package com.backend.controller;

import com.backend.pojo.User;
import com.backend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import com.backend.pojo.Result;


@Slf4j // 该注解用于记录日志
@RestController
@CrossOrigin(origins = "http://localhost:8080", methods = RequestMethod.POST)
public class RegisterController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(@RequestBody User user) { // @RequestBody注解就是将json格式的数据封装到实体类当中
        log.info("用户注册: {}", user); // 使用了日志记录工具，将注册操作的相关信息打印到日志中。
        int registeredUser = userService.register(user);
        if (registeredUser >= 1) {
            return new Result(1, "注册成功", registeredUser);
        } else {
            return new Result(0, "注册失败", null);
        }
    }
}
