package test;

import net920vip.bean.UserBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        // 配置文件
        System.out.println("打印日志");
        String resource = "SqlMapConfig.xml";

        InputStream inputStream = Resources.getResourceAsStream(resource);
        System.out.println("打印日志 结束");

        // 使用SqlSessionFactoryBuilder从xml配置文件中创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建数据库会话实例sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 查询单个记录，根据用户id查询用户信息
        UserBean user = sqlSession.selectOne("test.findUserById", 10);
        System.out.println(user.getUsername());

        // 根据用户名模糊查询
        List<UserBean> list = sqlSession.selectList("test.findUserByUsername", "张");
        System.out.println(list);

        // 新增user
//        UserBean user1 = new UserBean();
//        user1.setUsername("66");
////        user1.setBirthday("");
//        user1.setSex("1");
//        user1.setAddress("中国");
//        sqlSession.insert("test.insertUser",user1);


        // 删除
//        sqlSession.delete("test.deleteUserById",27);

        UserBean user2 = new UserBean(10, "Charles", "1", new Date(), "中国");

        sqlSession.update("test.updateUserById",user2);


        // 提交事务
        sqlSession.commit();


    }
}
