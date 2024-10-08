package org.ppzhu.mapper;

import org.junit.jupiter.api.Test;
import org.ppzhu.pojo.User;
import org.ppzhu.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @Author: ppzhu
 * @Date: 2024/10/8
 * @Description: 
 *   Describe the purpose or functionality of the class here.
 *   You can provide detailed explanations, usage examples, etc.
 *
 * @Modification History:
 *   Date         Author          Description
 *   -----------  --------------  -----------------------------------
 *   2024/10/8      ppzhu         Initial version
 *
 * @Copyright:
 *   Copyright 2024, ppzhu.
 *   All rights reserved.
 */
@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void insertUser() {
        User user = new User();

        user.setUsername("admin");
        user.setPassword("123456");
        user.setEmail("example@gmail.com");
        user.setPhone("18545821547");
        user.setIsActive("0");

        userMapper.insertUser(user);
    }

    @Test
    void updateUser() {
        User user = new User();
        user.setUserId(1L);

        user.setCreatedBy(1L);
        user.setUpdatedBy(1L);
        user.setUpdatedAt(TimeUtil.getCurrentTimestamp());

        int i = userMapper.updateUser(user);
        assertEquals(1,i);
    }

    @Test
    void deleteUser() {
    }

    @Test
    void selectUserById() {
        User user = userMapper.selectUserById(1L);
        assertNotNull(user);
    }

    @Test
    void selectUserByUsername() {
        User user = userMapper.selectUserByUsername("admin");
        assertEquals("example@gmail.com",user.getEmail());
    }

    @Test
    void selectAllUser() {
        List<User> users =
                userMapper.selectAllUser();
        assertEquals(1,users.size());
    }
}