package com.epochong.mapper;

import com.epochong.bz.UserBz;
import com.epochong.po.UserEx;

import java.util.List;

/**
 * @author epochong
 * @date 2019/8/10 11:31
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * 持久层
 * 通过UserMapper userMapper = sqlSession.getMapper(UserMapper.class);获得对象
 */
public interface UserMapper {
     List<UserEx> queryUserByZH(UserBz userBz) throws Exception;
}
