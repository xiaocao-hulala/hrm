/*
import com.dao.UserDao;
import com.entity.User;
import com.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

*/
/**
 * @Author:caocong
 * @Description:
 * @Date:create in 20:48 2020/5/16
 *//*
 */
/*
*用户测试类
create by caocong on  2020/5/16
*//*

public class UserMapperTest {


    @Test
    public void selectall() {
        SqlSession sqlSession = MyBatisUtils.getSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> list = userDao.selectall();

        for (User user : list) {
            System.out.println(list);
        }
    }


    @Test
    public void delete() {

        SqlSession sqlSession = MyBatisUtils.getSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int result = userDao.delete(1);

        System.out.println(result);
    }


    @Test
    public void update() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setId(1);
        user.setLoginname("管理员bb");
        int result = userDao.update(user);
        System.out.println(result);
    }


    @Test
    public void insert() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setLoginname("管理员dd");
        int re = userDao.insert(user);
        System.out.println(re);

    }


    @Test
    public void selectByParams() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setLoginname("admi");
        user.setUsername("a");
        List<User> list = userDao.selectByParams(user);
        for (User u : list) {
            System.out.println(u);
        }

    }
}
*/
