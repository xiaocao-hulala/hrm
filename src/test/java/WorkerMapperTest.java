import com.dao.WorkerDao;
import com.entity.Worker;
import com.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 23:12 2020/5/16
 *//*
*员工mapper测试类
create by caocong on  2020/5/16
*/
public class WorkerMapperTest {


    @Test
    public void selectByParams() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        WorkerDao workerDao = sqlSession.getMapper(WorkerDao.class);
        Worker worker = new Worker();
        worker.setName("曹");
        List<Worker> list = workerDao.selectByParams(worker);

        for (Worker wor : list) {
            System.out.println(wor);
        }
    }
}
