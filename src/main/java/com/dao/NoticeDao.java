package com.dao;

import com.commons.BaseDao;
import com.entity.Notice;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 19:24 2020/5/19
 *//*
*公告数据层
create by caocong on  2020/5/19
*/
public interface NoticeDao extends BaseDao<Notice> {
//这样继承了一个通用的dao层方法，就可以写这张表某些特殊需求代码了
}
