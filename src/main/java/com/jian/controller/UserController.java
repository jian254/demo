package com.jian.controller;

import com.jian.dao.UserDao;
import com.jian.entity.Result;
import com.jian.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by jian on 17/7/28.
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserDao userDao;

    @RequestMapping("")
    public String loginUI() {
        return "user/index";
    }


    @ResponseBody
    @PostMapping(value = "/login")
    public Result<User> login(String username, String password) {


        System.out.println("username=" + username);

        Result<User> result = new Result<User>();
        if (userDao.findByUsername(username) == null) {
            result.setInfo("没有该用户名");
            return result;
        }

        User user = userDao.findbyusernameAndpassword(username, password);//登录
        if (user == null) {
            result.setInfo("密码错误");
            return result;
        }
        result.setStatus(0);
        result.setData(user);
        result.setInfo("登录成功");
        return result;
    }


    /**
     * 注册接口
     *
     * @param user
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/register")
    public Result<User> register(User user) {
        Result<User> result = new Result<>();
        try {
            if (userDao.findByUsername(user.getUsername()) != null) {
                result.setInfo("该用户已存在");
                result.setStatus(1);
            } else {
                user = userDao.save(user);
                result.setData(user);
                result.setStatus(0);
                result.setInfo("注册成功");
            }
        } catch (Exception e) {
            result.setStatus(1);
            result.setInfo("注册失败");
        }
        return result;
    }


    /**
     * 注册接口
     *
     * @param username
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/findby")
    public Result<User> findByusername(String username) {
        Result<User> result = new Result<>();
        try {
            User user = userDao.findByUsername(username);
            result.setData(user);
            result.setStatus(0);
            result.setInfo("查询成功");
        } catch (Exception e) {
            result.setStatus(1);
            result.setInfo("查询失败");
        }
        return result;
    }


}
