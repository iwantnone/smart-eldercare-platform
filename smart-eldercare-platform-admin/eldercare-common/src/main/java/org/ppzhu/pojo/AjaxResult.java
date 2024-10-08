package org.ppzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AjaxResult<T>{

    private int code;
    private String msg;
    private T data;


    public static <T> AjaxResult<T> success(){
        return new AjaxResult(200,"成功",null);
    }

    public static <T> AjaxResult<T> success(String msg){
        return new AjaxResult(200,msg,null);
    }


    public static <T> AjaxResult<T> success(T data){
        return new AjaxResult(200,"成功",data);
    }

    public static <T> AjaxResult<T> error(int code,String msg){
        return new AjaxResult(code,msg,null);
    }


}
