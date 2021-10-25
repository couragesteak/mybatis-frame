package net920vip.mapper;

import net920vip.bean.UserBean;

import java.util.List;

/**
 * 接口文件 对应UserMapper.xml文件
 * 用户管理mapper
 * */
public interface UserMapper {

    // 根据id查询user
    public UserBean findUserById(int id) throws Exception;
    // 根据用户名模糊查询
    public List<UserBean> findUserByUsername(String username)throws Exception;
    // 新增user 返回类型 int或void均可
    public int insertUser(UserBean user) throws Exception;
    // 新增user 返回类型 int或void均可
    public int updateUserById(UserBean user) throws Exception;
    // 根据user删除user
    public int deleteUserById(int id) throws Exception;
    // 传递pojo综合查询用户信息
    public List<UserBean> findUserList(UserBean USER) throws Exception;

    // 批量根据ids查询
    public List<UserBean> selectUserByIds(List<Integer> list) throws Exception;

}
