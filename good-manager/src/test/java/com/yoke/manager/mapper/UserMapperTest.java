package com.yoke.manager.mapper;

import com.yoke.manager.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void addTest() {
        User user = new User();
        user.setUsername("yo");
        user.setPassword("12");
        user.setEmail("1212323");
        user.setPhone("124");
        Assert.assertEquals(1, userMapper.insert(user));
    }
}
