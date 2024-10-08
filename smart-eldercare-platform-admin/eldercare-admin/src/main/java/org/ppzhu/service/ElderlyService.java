package org.ppzhu.service;

import org.ppzhu.pojo.CommonPage;
import org.ppzhu.pojo.ElderlyProfile;

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
public interface ElderlyService {
    int addElderlyProfile(ElderlyProfile elderlyProfile);
    int updateElderlyProfile(ElderlyProfile elderlyProfile);
    int deleteElderlyProfile(Long elderlyProfileId);
    ElderlyProfile getElderProfileById(Long elderlyProfileId);
    List<ElderlyProfile> getElderProfileByUserId(Long userId);
    CommonPage<ElderlyProfile> getElderProfileLists(int pageNo,int pageSize,ElderlyProfile elderlyProfile);
}
