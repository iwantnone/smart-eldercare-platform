package org.ppzhu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.ppzhu.mapper.ElderlyProfileMapper;
import org.ppzhu.pojo.CommonPage;
import org.ppzhu.pojo.ElderlyProfile;
import org.ppzhu.service.ElderlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class ElderlyServiceImpl implements ElderlyService {

    @Autowired
    private ElderlyProfileMapper elderlyProfileMapper;


    @Override
    public int addElderlyProfile(ElderlyProfile elderlyProfile) {
        return elderlyProfileMapper.insertElderlyProfile(elderlyProfile);
    }

    @Override
    public int updateElderlyProfile(ElderlyProfile elderlyProfile) {
        return elderlyProfileMapper.updateElderlyProfile(elderlyProfile);
    }

    @Override
    public int deleteElderlyProfile(Long elderlyProfileId) {
        return elderlyProfileMapper.deleteElderlyProfile(elderlyProfileId);
    }

    @Override
    public ElderlyProfile getElderProfileById(Long elderlyProfileId) {
        return elderlyProfileMapper.selectElderlyProfileById(elderlyProfileId);
    }

    @Override
    public List<ElderlyProfile> getElderProfileByUserId(Long userId) {
        return elderlyProfileMapper.selectElderlyProfileByUserId(userId);
    }

    @Override
    public CommonPage<ElderlyProfile> getElderProfileLists(int pageNo, int pageSize, ElderlyProfile elderlyProfile) {
        Page<ElderlyProfile> elderlyPage = PageHelper.startPage(pageNo, pageSize);
        elderlyProfileMapper.selectElderlyProfileLists();
        return new CommonPage<>(pageNo,pageSize,elderlyPage.getTotal(),elderlyPage.getResult());
    }
}
