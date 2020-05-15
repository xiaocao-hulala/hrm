package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 10:28 2020/5/14
 *//*
*mybatis工具类
create by caocong on  2020/5/14
*/
public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //单例
            //1.读取配置文件
            InputStream inputStream = Resources.getResourceAsStream("mybatisconfig.xml");
            //2.创建session工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }

    public static <T> T getMapper(Class cls) {
        return (T) getSession().getMapper(cls);
    }

}
