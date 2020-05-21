import com.dao.PositionDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 10:44 2020/5/21
 *//*
*针对职位表使用通用mapper插件测试类
create by caocong on  2020/5/21
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-datasource.xml", "classpath:applicationContext-bean.xml"})
public class PostionMapperTest {

    @Autowired
    PositionDao positionDao;

    @Test
    public void test() {
     /*   positionDao.selectAll().forEach(position -> {

            System.out.println(position);
        });*/

        System.out.println(positionDao.selectByPrimaryKey(1));
    }
}
