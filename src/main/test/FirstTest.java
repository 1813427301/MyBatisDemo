
import entriy.User;
import entriy.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.MyBatisUtil;

import java.util.Date;
import java.util.List;

public class FirstTest {

    private SqlSession session;
    private UserMapper userMapper;

    @Before
    public void init(){
        //获取sqlSession对象
        session = MyBatisUtil.getSession();
        //获取UserMapper对象
        userMapper = session.getMapper(UserMapper.class);
    }

    @After
    public void close(){
        session.commit();
        session.close();
    }

    @Test
    public void findAllUser(){
        //调用Mapper的方法
        List<User> list = userMapper.findAll();
        for (User user:list) {
            System.out.println(user);
        }
    }

    @Test
    public void addUser(){
        User user = new User("lisa","444554","女",new Date());
        int row = userMapper.create(user);
        System.out.println("id：" + user.getId());
        System.out.println("row：" + row);
    }

    @Test
    public void updateUser(){
        User user = new User(1,"菜虚鲲","66867","女",new Date());
        int row = userMapper.update(user);
        System.out.println("row：" + row);
    }

    @Test
    public void deleteUser(){
        int id = 4;
        int row = userMapper.delete(id);
        System.out.println("row：" + row);
    }

    @Test
    public void findUserById(){
        int id = 3;
        User user = userMapper.findById(id);
        System.out.println(user);
    }
}
