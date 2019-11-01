package com.lxy.springboot.utils;

import com.lxy.springboot.domain.Msg;

public class ResultUtil {
    /**
     * 请求成功返回
     * @param object
     * @return
     */
    public static Msg success(Object object){
        Msg msg=new Msg();
        msg.setCode(200);
        msg.setMsg("success");
        msg.setData(object);
        return msg;
    }
    public static Msg success(){
        return success(null);
    }

    public static Msg error(Integer code,String resultmsg){
        Msg msg=new Msg();
        msg.setCode(code);
        msg.setMsg(resultmsg);
        return msg;
    }
}
