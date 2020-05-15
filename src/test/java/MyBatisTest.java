import com.dao.DepartmentDao;
import com.dao.UserDao;
import com.entity.Department;
import com.entity.User;
import com.util.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 21:43 2020/5/12
 *//*
*测试User类
create by caocong on  2020/5/12
*/
public class MyBatisTest {

    //private static Logger log = Logger.getLogger(Test.class.getClass());

    @Test
    public void selctall() throws Exception {
       /*     //1.读取配置文件:
        InputStream inputStream  =Resources.getResourceAsStream("mybatisconfig.xml");


        //2创建session工厂
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);


        //3.创建一个sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4.调用给指定sql语句(这里指定命名空间 user：包名)
        List<User> list = sqlSession.selectList("user.selectall");


        //5.输出测试
        for(User user :list){
            System.out.println(user);
        }*/

        SqlSession sqlSession = MyBatisUtils.getSession();

        /**
         * 映射实现
         */
        DepartmentDao departmentDao = sqlSession.getMapper(DepartmentDao.class);

        Department department = new Department();

        department.setId(1);

        List<Department> list = departmentDao.selectByParams(department);

      /*  for (User user : list) {
            System.out.println(user);
        }*/

        for (Department depar : list) {
            System.out.println(depar);
        }
    }


    @Test
    public void updateDepartment() {

        SqlSession sqlSession = MyBatisUtils.getSession();
        DepartmentDao departmentDao = sqlSession.getMapper(DepartmentDao.class);
     /*   Department department = new Department();

        department.setId(1);*/
        int list = departmentDao.deleteDepartment(1);
            System.out.println(list);
    }

}
