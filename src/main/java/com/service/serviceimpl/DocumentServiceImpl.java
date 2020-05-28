package com.service.serviceimpl;

import com.commons.BaseServiceImpl;
import com.dao.DocumentDao;
import com.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 9:50 2020/5/20
 *//*
*文件业务层实现类
create by caocong on  2020/5/20
*/



@Service
public class DocumentServiceImpl extends BaseServiceImpl<Document> {

    @Autowired
    public void setBaseDao(DocumentDao documentDao) {

        super.baseDao = documentDao;
    }
}
