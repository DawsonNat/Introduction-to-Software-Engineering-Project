package com.backend;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class BackEndApplicationTests {

    @Test
    void contextLoads() {
    }

    /*
    测试生成JWT令牌
     */
    @Test
    public void testGenJwt() {
        Map<String, Object> claims = new HashMap<>(); // 创建一个map对象
        claims.put("id", 1); // 向map集合中存储id以及name数据
        claims.put("name", "tom");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "ITSEP") // 指定签名算法和密钥
                .setClaims(claims) // 这里需要map集合，所以在上面定义map集合(设置自定义内容，也就是有效载荷)
                .setExpiration(new Date(System.currentTimeMillis() + 3600*1000)) // 设置令牌有效时间为1个小时
                .compact(); // 调用compact方法来返回一个字符串，该字符串就是令牌
        System.out.println(jwt);
    }
}
