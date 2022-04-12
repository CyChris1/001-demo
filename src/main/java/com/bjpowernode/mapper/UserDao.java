package com.bjpowernode.mapper;

import com.bjpowernode.entity.Book;
import com.bjpowernode.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    int insertUser(Integer userid, String username, String password, String email, String phone);

    List<User> selectUserById(@Param("stusId") Integer userid);

    int deleteUserById(@Param("studId1") Integer bookid);

    int updateUser(@Param("uid") Integer userid,
                   @Param("uusername") String username,
                   @Param("upassword") String password,
                   @Param("uemail") String email,
                   @Param("uphone") String phone);
//    List<User> selectBorrowById(@Param("stusId") Integer userid);
}
