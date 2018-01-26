package cn.kyle.shoppingMall.mapper;

import cn.kyle.shoppingMall.domain.User;
import org.apache.ibatis.annotations.Param;
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
    User findUserById(@Param(value = "userId") String id);

    /**
     * 删除user
     * @param id
     */
    void deleteUserById(@Param(value = "userId")String id);

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


    List<User> findByUser(User user);
}
