package com.backend.controller;

import com.backend.pojo.User;
import com.backend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.backend.pojo.Result;

@Slf4j // 该注解用于记录日志
@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user) { // @RequestBody注解就是将json格式的数据封装到实体类当中
        log.info("用户登录: {}", user); // 使用了日志记录工具，将登录操作的相关信息打印到日志中。
        User u = userService.login(user);
        return u!=null?Result.success():Result.error("用户名或密码错误");
    }
}
