import com.dao.NoticeDao;
import com.dao.UserDao;
import com.entity.Notice;
import com.entity.User;
import com.entity.Worker;
import com.service.WorkServiceDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Set;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 21:16 2020/5/18
 *//*
*员工业务测试类
create by caocong on  2020/5/18
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-datasource.xml", "classpath:applicationContext-bean.xml"})
public class WorkerServiceTest {
    @Autowired
    WorkServiceDao workServiceDao;

    @Autowired
    UserDao userDao;


    @Autowired
    NoticeDao noticeDao;

    @Test
    public  void test(){
  /*      Worker  worker = new Worker();
        worker.setName("曹");
        List<Worker> list =  workServiceDao.selectByParams(worker,1,10);
        System.out.println(list);*/


        Notice notice = new Notice();

        System.out.println(noticeDao.selectall(notice));
    }



    @Test
    public  void test2(){
       /* User user = userDao.queryByUserName("管理员a");


        Set<String> sets = userDao.querypressNameByUserName("管理员a");

        System.out.println("sets:"+sets);
        System.out.println(userDao.queryRoleNameByUserName("管理员a"));
        System.out.println(user);*/




    }
}
