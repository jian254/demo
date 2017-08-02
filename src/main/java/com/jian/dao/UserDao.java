package com.jian.dao;

import com.jian.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by jian on 17/7/28.
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

    /**
     * 根据用户名查询数据
     *
     * @param username
     * @return
     */
    public User findByUsername(String username);


    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    @Query("select u from User u where u.username=?1 and u.password=?2")
    public User findbyusernameAndpassword(String username, String password);
}
