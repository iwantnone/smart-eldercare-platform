package org.ppzhu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.ppzhu.mapper.UserMapper;
import org.ppzhu.pojo.CommonPage;
import org.ppzhu.pojo.User;
import org.ppzhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: ppzhu
 * @Date: 2024/10/8
 * @Description: Describe the purpose or functionality of the class here.
 * You can provide detailed explanations, usage examples, etc.
 * @Modification History:
 * Date         Author          Description
 * -----------  --------------  -----------------------------------
 * 2024/10/8      ppzhu         Initial version
 * @Copyright: Copyright 2024, ppzhu.
 * All rights reserved.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUserById(Long userId) {
        return userMapper.deleteUser(userId);
    }

    @Override
    public User getUserById(Long userId) {
        return userMapper.selectUserById(userId);
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.selectUserByUsername(username);
    }

    @Override
    public CommonPage<User> getUserLists(int pageNo, int pageSize, User user) {

        Page<User> userPage = PageHelper.startPage(pageNo, pageSize);
        userMapper.selectAllUser();
        return new CommonPage<>(pageNo,pageSize,userPage.getTotal(),userPage.getResult());
    }
}
