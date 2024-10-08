package org.ppzhu.mapper;

import org.apache.ibatis.annotations.Mapper;
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
@Mapper
public interface ElderlyProfileMapper {
    int insertElderlyProfile(ElderlyProfile elderlyProfile);
    int updateElderlyProfile(ElderlyProfile elderlyProfile);
    int deleteElderlyProfile(Long elderlyId);
    ElderlyProfile selectElderlyProfileById(Long elderlyId);
    List<ElderlyProfile> selectElderlyProfileByUserId(Long userId);
    List<ElderlyProfile> selectElderlyProfileLists();
}
