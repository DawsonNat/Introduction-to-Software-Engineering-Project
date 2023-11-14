package com.backend.service;

import com.backend.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    /**
     * 用户登录
     * @param user
     * @return
     */
    User login(User user);
}
