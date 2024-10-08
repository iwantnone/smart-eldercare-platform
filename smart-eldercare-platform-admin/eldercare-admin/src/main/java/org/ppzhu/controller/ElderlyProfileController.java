package org.ppzhu.controller;

import org.ppzhu.pojo.AjaxResult;
import org.ppzhu.pojo.CommonPage;
import org.ppzhu.pojo.ElderlyProfile;
import org.ppzhu.service.ElderlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RestController
@RequestMapping("/elderly")
public class ElderlyProfileController {
    @Autowired
    private ElderlyService elderlyService;

    @GetMapping("/{elderlyId}")
    public AjaxResult<ElderlyProfile> getElderlyProfile(@PathVariable Long elderlyId) {
        ElderlyProfile elderProfile = elderlyService.getElderProfileById(elderlyId);
        return AjaxResult.success(elderProfile);
    }

    @GetMapping
    public AjaxResult<List<ElderlyProfile>> getElderlyProfileByUserId(@RequestParam Long userId) {
        List<ElderlyProfile> elderProfile = elderlyService.getElderProfileByUserId(userId);
        return AjaxResult.success(elderProfile);
    }

    @PostMapping
    public AjaxResult<?> addElderlyProfile(@RequestBody ElderlyProfile elderlyProfile) {
        elderlyService.addElderlyProfile(elderlyProfile);
        return AjaxResult.success();
    }

    @PutMapping
    public AjaxResult<?> updateElderlyProfile(@RequestBody ElderlyProfile elderlyProfile) {
        elderlyService.updateElderlyProfile(elderlyProfile);
        return AjaxResult.success();
    }

    @DeleteMapping
    public AjaxResult<?> deleteElderlyProfile(@RequestParam Long elderlyId) {
        elderlyService.deleteElderlyProfile(elderlyId);
        return AjaxResult.success();
    }

    @GetMapping("/list")
    public AjaxResult<CommonPage<ElderlyProfile>> getElderlyProfileLists(@RequestParam(defaultValue = "1") Integer page,
                                                                         @RequestParam(defaultValue = "10") Integer size,
                                                                         @RequestParam(required = false) ElderlyProfile elderlyProfile) {
        CommonPage<ElderlyProfile> elderProfileLists = elderlyService.getElderProfileLists(page, size, elderlyProfile);
        return AjaxResult.success(elderProfileLists);
    }
}
