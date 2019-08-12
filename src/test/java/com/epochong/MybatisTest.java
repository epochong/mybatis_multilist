package com.epochong;
import com.epochong.bz.UserBz;
import com.epochong.mapper.UserMapper;
import com.epochong.po.User;
import com.epochong.po.UserEx;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author epochong
 * @date 2019/8/10 11:58
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void testInitialtive(){
        String file = "sqlMapConfig.xml";
        InputStream is = null;
        try{
            is = Resources.getResourceAsStream(file);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void testQueryUserByZH(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            UserEx userEx = new UserEx();
            userEx.setSex("1");
            userEx.setUsername("o");
            UserBz userBz = new UserBz();
            userBz.setUserEx(userEx);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<UserEx>  userExList = userMapper.queryUserByZH(userBz);
            System.out.println(userExList);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
