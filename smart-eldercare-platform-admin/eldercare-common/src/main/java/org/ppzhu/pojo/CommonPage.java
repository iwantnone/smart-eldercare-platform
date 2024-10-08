package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: ppzhu
 * @Date: 2024/10/8
 * @Description:  通用分页对象，在需要返回分页信息的地方通用
 * @Modification History:
 * Date         Author          Description
 * -----------  --------------  -----------------------------------
 * 2024/10/8      ppzhu         Initial version
 * @Copyright: Copyright 2024, ppzhu.
 * All rights reserved.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonPage<T> {
    private int pageNo;
    private int pageSize;
    private long total;
    private List<T> elements;
}
