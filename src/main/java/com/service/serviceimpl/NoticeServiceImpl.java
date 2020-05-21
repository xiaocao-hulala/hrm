package com.service.serviceimpl;

import com.commons.BaseServiceImpl;
import com.dao.NoticeDao;
import com.entity.Notice;
import com.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 19:28 2020/5/19
 *//*
*业务实现类
create by caocong on  2020/5/19
*/


@Service
public class NoticeServiceImpl  extends BaseServiceImpl<Notice> {

    //给父类中的baseDao赋值
    @Autowired
     public  void  setBaseDao(NoticeDao noticeDao){
         super.baseDao=noticeDao;
     }
}
