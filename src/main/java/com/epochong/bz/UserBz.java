package com.epochong.bz;

import com.epochong.po.User;
import com.epochong.po.UserEx;

/**
 * @author epochong
 * @date 2019/8/10 11:06
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe User包装类,提供公共访问
 * 但是在指定resultMap的时候必须指定到具体类
 * 这个标签不能跨越UserEx类找到User的getter和setter方法
 */
public class UserBz {


    private UserEx userEx;

    public UserBz() {
    }

    public UserEx getUserEx() {
        return userEx;
    }

    public void setUserEx(UserEx userEx) {
        this.userEx = userEx;
    }
}
