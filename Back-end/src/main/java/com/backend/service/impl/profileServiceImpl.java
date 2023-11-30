package com.backend.service.impl;

import com.backend.mapper.profileMapper;
import com.backend.pojo.Profile;
import com.backend.service.profileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class profileServiceImpl implements profileService {

    @Autowired
    private profileMapper profileMapper;


    @Override
    public void info(Profile profile) {
        profileMapper.info(profile);
    }
}
