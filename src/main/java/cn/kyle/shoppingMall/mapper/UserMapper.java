package cn.kyle.shoppingMall.mapper;

import cn.kyle.shoppingMall.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/14.
 */
@Repository
public interface UserMapper {

    /**
     * 新增user
     * @param user
     */
    void addUser(User user);

    /**
     * 根据id查找user
     * @param id
     * @return
     */
    User findUserById(String id);

    /**
     * 删除user
     * @param id
     */
    void deleteUserById(String id);

    /**
     * 修改user
     * @param user
     */
    void updateUser(User user);


    /**
     * 查询所有user
     * @return
     */
    List<User> findAll();

    /**
     * 查询User是否存在
     * @param user
     * @return
     */
    Integer isUserExits(User user);
}
