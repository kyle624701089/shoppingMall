package cn.kyle.shoppingMall.service.impl;

import cn.kyle.shoppingMall.domain.User;
import cn.kyle.shoppingMall.mapper.UserMapper;
import cn.kyle.shoppingMall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户service实现类
 *
 * @author kyle
 * @create 2018 - 01 - 26 10:24
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        return userMapper.findAll();
    }

    @Override
    public List<User> selectByUser(User user) {
        return userMapper.findByUser(user);
    }

    @Override
    public void delByUserId(String userId) {
        userMapper.deleteUserById(userId);
    }

    @Override
    public void insertUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public User selectByUserId(String userId) {
        return userMapper.findUserById(userId);
    }
}
