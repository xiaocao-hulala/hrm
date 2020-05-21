package com.service.serviceimpl;

import com.commons.BaseServiceImpl;
import com.dao.PositionDao;
import com.entity.Position;
import com.service.PostionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 19:34 2020/5/19
 *//*
*业务层接口实现类
create by caocong on  2020/5/19
*/
@Service
public class PositionServiceImpl extends BaseServiceImpl<Position>{
   /* //需要给父类的BaseServiceImpl中的baseDao赋值
    @Autowired//改注解定义在方法上相当于给参数赋值，相当于就是属性
    public void setBaseDao(PositionDao positionDao) {
        super.baseDao=positionDao;
    }*/
}
