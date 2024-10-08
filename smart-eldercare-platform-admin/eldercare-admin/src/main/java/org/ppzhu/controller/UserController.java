package org.ppzhu.controller;

import org.ppzhu.pojo.AjaxResult;
import org.ppzhu.pojo.CommonPage;
import org.ppzhu.pojo.User;
import org.ppzhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public AjaxResult<User> getUserById(@PathVariable Long userId) {
        User user = userService.getUserById(userId);
        return AjaxResult.success(user);
    }

    @GetMapping
    public AjaxResult<User> getUserByUsername(@RequestParam String username) {
        User user = userService.getUserByUsername(username);
        return AjaxResult.success(user);
    }

    @PutMapping
    public AjaxResult<?> updateUser(@RequestBody User user) {
        int result = userService.updateUser(user);
        return result > 0 ? AjaxResult.success() : AjaxResult.error(400, "修改失败");
    }

    @DeleteMapping("/{userId}")
    public AjaxResult<?> deleteUser(@PathVariable Long userId) {
        int result = userService.deleteUserById(userId);
        return result > 0 ? AjaxResult.success("删除成功") : AjaxResult.error(400, "删除失败");
    }

    @PostMapping
    public AjaxResult<?> addUser(@RequestBody User user) {
        int result = userService.addUser(user);
        return result > 0 ? AjaxResult.success("新增成功") : AjaxResult.error(400, "新增失败");
    }

    @GetMapping("/list")
    public AjaxResult<CommonPage<User>> getUserList(@RequestParam(defaultValue = "1") int pageNo,
                                                    @RequestParam(defaultValue = "10") int pageSize,
                                                    @RequestParam(required = false) User user) {
        CommonPage<User> userPage = userService.getUserLists(pageNo, pageSize, user);
        return AjaxResult.success(userPage);
    }
}

