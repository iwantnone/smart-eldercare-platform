package org.ppzhu.mapper;

import org.apache.ibatis.annotations.Mapper;
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
@Mapper
public interface UserMapper {
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(Long userId);
    User selectUserById(Long userId);
    User selectUserByUsername(String username);
    List<User> selectAllUser();
}
