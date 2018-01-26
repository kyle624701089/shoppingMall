package cn.kyle.shoppingMall.service;

import cn.kyle.shoppingMall.domain.User;

import java.util.List;

public interface IUserService {
    List<User> selectAllUser();

    List<User> selectByUser(User user);

    void delByUserId(String userId);

    void insertUser(User user);

    void updateUser(User user);

    User selectByUserId(String userId);
}
