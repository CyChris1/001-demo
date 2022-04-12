package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.UserDao;
import com.bjpowernode.entity.User;
import com.bjpowernode.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int addUser(Integer userid, String username, String password, String email, String phone) {

        int nums=userDao.insertUser(userid,username,password,email,phone);
        return nums;
    }

    @Override
    public List<User> queryUser(Integer userid) {

        List<User> users=userDao.selectUserById(userid);
        return users;
    }

    @Override
    public int deleteUserById(Integer userid) {
       int nums= userDao.deleteUserById(userid);
        return nums;
    }

    @Override
    public int updateUser(Integer userid, String username, String password, String email, String phone) {

       int nums = userDao.updateUser(userid, username, password, email, phone);
       return nums;
    }

//    @Override
//    public List<User> selectBorrowById(Integer userid) {
//
//        List<User> borrows=userDao.selectBorrowById(userid);
//        return borrows;
//    }

}
