package org.ppzhu.mapper;

import org.junit.jupiter.api.Test;
import org.ppzhu.pojo.ElderlyProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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
@SpringBootTest
class ElderlyProfileMapperTest {

    @Autowired
    private ElderlyProfileMapper elderlyProfileMapper;

    @Test
    void insertElderlyProfile() {

        ElderlyProfile elderlyProfile = new ElderlyProfile();
        elderlyProfile.setElderlyName("张宏");
        elderlyProfile.setElderlyPhone("1888456846");
        elderlyProfile.setAge(22);
        elderlyProfile.setGender("0");
        elderlyProfile.setCreatedBy(1L);


        elderlyProfileMapper.insertElderlyProfile(elderlyProfile);
    }

    @Test
    void updateElderlyProfile() {
        ElderlyProfile elderlyProfile = new ElderlyProfile();

        elderlyProfile.setElderlyId(1L);
        elderlyProfile.setAge(58);

        elderlyProfileMapper.updateElderlyProfile(elderlyProfile);
    }

    @Test
    void selectElderlyProfileById() {
        ElderlyProfile elderlyProfile = elderlyProfileMapper.selectElderlyProfileById(1L);
        System.out.println(elderlyProfile);
    }

    @Test
    void selectElderlyProfileByUserId() {
    }

    @Test
    void selectElderlyProfileLists() {
        System.out.println(elderlyProfileMapper.selectElderlyProfileLists());
    }
}