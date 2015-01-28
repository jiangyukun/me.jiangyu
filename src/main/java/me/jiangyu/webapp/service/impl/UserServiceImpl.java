package me.jiangyu.webapp.service.impl;

import me.jiangyu.webapp.dao.UserRepository;
import me.jiangyu.webapp.domain.User;
import me.jiangyu.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by jiangyukun on 2014/11/23.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        user.setRegistrationDate(new Date());
        userRepository.save(user);
    }

    @Override
    public User findUserById(String id) {
        return userRepository.findOne(id);
    }

    @Override
    public User findUserByMobile(String mobile) {
        return userRepository.findUserByMobile(mobile);
    }

    @Override
    public boolean login(String username, String password) {
        if (null == userRepository.login(username, password)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean loginByMobile(String mobile, String password) {
        if (null == userRepository.loginByMobile(mobile, password)) {
            return false;
        }
        return true;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserById(String id) {

    }
}
