package com.bjpowernode.service;

import com.bjpowernode.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    int addUser(Integer userid, String username, String password, String email, String phone);
    List<User> queryUser(Integer userid);
    int deleteUserById(Integer userid);
    int updateUser(Integer userid, String username, String password, String email, String phone);
//    List<User> selectBorrowById(Integer userid);
}
