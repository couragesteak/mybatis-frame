package test;

import net920vip.bean.UserBean;
import net920vip.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
// 配置文件
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

// 使用SqlSessionFactoryBuilder从xml配置文件中创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
// 创建数据库会话实例sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();


//        // 查询单个记录，根据用户id查询用户信息
//        UserBean user = sqlSession.selectOne("test.findUserById", 10);
//        System.out.println(user.getUsername());

//        // 根据用户名模糊查询
//        List<UserBean> list = sqlSession.selectList("test.findUserByUsername", "张");
//        System.out.println(list);

        // 新增user
//        UserBean user1 = new UserBean();
//        user1.setUsername("66");
////        user1.setBirthday("");
//        user1.setSex("1");
//        user1.setAddress("中国");
//        sqlSession.insert("test.insertUser",user1);


        // 删除
//        sqlSession.delete("test.deleteUserById",27);
////         提交事务
//        sqlSession.commit();

//        // 修改
//        UserBean user2 = new UserBean(10, "Charles", "1", new Date(), "中国");
//        sqlSession.update("test.updateUserById",user2);
//        // 提交事务
//        sqlSession.commit();


        // ---------------Mappper接口开发测试-------------
        // 使用动态代理获得UserMapper接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 查询
//        UserBean user = userMapper.findUserById(10);
//        System.out.println(user);

        // 新增
        //UserBean user1 = new UserBean(20,"李白", "2",new Date(), "666");
        //userMapper.insertUser(user1);
        //sqlSession.commit();
        //sqlSession.close();

        // 修改
//        UserBean user1 = new UserBean(26, "李白2", "2", new Date(), "666");
//        userMapper.updateUserById(user1);
//        sqlSession.commit();
//        sqlSession.close();

        // 删除
        // userMapper.deleteUserById(1);


//        // 使用sql片段，综合查询测试
        List<UserBean> userList = userMapper.findUserList(null);
//        // 查询所有
        System.out.println(userList.toString());
//
//        UserBean user = new UserBean();
//        user.setId(10);
//        List<UserBean> userList1 = userMapper.findUserList(user);
//        System.out.println(userList1.toString());


        // 使用foreach动态sql,批量查询  传空 null：查询所有
//        ArrayList<Integer> list = new ArrayList<>();

//        list.add(1);
//        list.add(10);
//        List<UserBean> users = userMapper.selectUserByIds(list);

//        List<UserBean> users = userMapper.selectUserByIds(Arrays.asList(1,10));
//        System.out.println(users.toString());

    }
}
