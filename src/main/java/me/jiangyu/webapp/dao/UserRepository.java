package me.jiangyu.webapp.dao;

import me.jiangyu.webapp.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by jiangyukun on 2014/11/23.
 */
public interface UserRepository extends CrudRepository<User, String> {

    @Query("select u from User u where u.username=:username and u.password=:password")
    public User login(@Param("username") String username, @Param("password") String password);

    @Query("select u from User u where u.mobile=:mobile and u.password=:password")
    public User loginByMobile(@Param("mobile") String mobile, @Param("password") String password);

    User findUserByMobile(String mobile);
}
