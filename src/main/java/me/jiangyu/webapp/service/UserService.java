package me.jiangyu.webapp.service;

import me.jiangyu.webapp.domain.User;

/**
 * Created by jiangyukun on 2014/11/23.
 */
public interface UserService {
    void saveUser(User user);

    User findUserById(String id);

    User findUserByMobile(String mobile);

    boolean login(String username, String password);

    boolean loginByMobile(String mobile, String password);

    void updateUser(User user);

    void deleteUserById(String id);
}
