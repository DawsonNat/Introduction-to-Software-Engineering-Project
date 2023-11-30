package com.backend.controller;


import com.backend.pojo.Profile;
import com.backend.pojo.Result;
import com.backend.service.profileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin
public class profileController {

    @Autowired
    private profileService profileService;

    @PostMapping("/profile")
    public Result info(@RequestBody Profile profile) {
        log.info("个人信息收集:{}", profile);
        profileService.info(profile);
        return Result.success();

    }

}