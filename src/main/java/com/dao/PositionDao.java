package com.dao;

import com.commons.BaseDao;
import com.entity.Notice;
import com.entity.Position;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 19:31 2020/5/19
 *//*
*职位数据层
create by caocong on  2020/5/19
*/
//使用通用mapper插件，所有dao接口只需要继承 mapper接口，即拥有单表的crud
//继承的时候需要指定泛型，改泛型就是指对应实体类
public interface PositionDao extends BaseDao<Position> {

    //当我们需要使用多表关联查询这时候可以自己在这定义一个方法来去配置文件写好调用这个方法就行了

    //通用mapper用于单表
}
