package com.mainapp;

import com.domain.User;
import com.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisAppTest {

    @Autowired
    private UserMapper userMapper;

    @Test

    public void test() {
        userMapper.insert("Jack", "123!", "3414344313");
        userMapper.insert("Rose", "2333", "1232423434");
        User u = userMapper.findUserByPhone("3414344313");
        Assert.assertEquals("Jack", u.getName());
    }
}

