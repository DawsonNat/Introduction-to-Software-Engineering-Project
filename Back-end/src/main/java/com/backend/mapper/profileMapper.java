package com.backend.mapper;

import com.backend.pojo.Profile;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface profileMapper {



    void info(Profile profile);
}
