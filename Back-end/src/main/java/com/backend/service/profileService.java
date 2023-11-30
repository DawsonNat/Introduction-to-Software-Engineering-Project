package com.backend.service;

import com.backend.pojo.Profile;
import org.springframework.stereotype.Service;

@Service
public interface profileService {
    void info(Profile profile);
}
