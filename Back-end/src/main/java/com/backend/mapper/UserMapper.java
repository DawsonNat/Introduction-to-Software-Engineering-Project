package com.backend.mapper;

import com.backend.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    /**
     * 根据用户名和密码查询员工
     * @param user
     * @return
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    User getByUsernameAndPassword(User user);

    /**
     * 注册用户
     * @param user
     * @return
     */
    @Insert("insert into user (username, password, mail) VALUES (#{username}, #{password}, #{mail})")
    int insertUserInfo(User user);
}
