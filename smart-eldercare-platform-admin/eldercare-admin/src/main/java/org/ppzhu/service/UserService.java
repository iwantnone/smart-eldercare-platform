package org.ppzhu.service;

import org.ppzhu.pojo.CommonPage;
import org.ppzhu.pojo.User;

import java.util.List;

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
public interface UserService {

    int addUser(User user);
    int updateUser(User user);
    int deleteUserById(Long userId);
    User getUserById(Long userId);
    User getUserByUsername(String username);

    CommonPage<User> getUserLists(int pageNo, int pageSize, User user);
}
