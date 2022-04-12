package com.bjpowernode.controller;

import com.bjpowernode.entity.User;
import com.bjpowernode.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.transform.Result;
import java.util.List;


@Api(tags = "用户管理类")
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private RedisTemplate redisTemplate;

    @ApiOperation("增加用户")
    @RequestMapping(value="/user/query",method={ RequestMethod.GET })
    @ResponseBody
    public int addUser(
            @ApiParam(name = "userid", value = "用户ID", required = false) @RequestParam(value = "userid", required = false) Integer userid,
            @ApiParam(name = "username", value = "用户名", required = false) @RequestParam(value = "username", required = false) String username,
            @ApiParam(name = "password", value = "密码", required = false) @RequestParam(value = "password", required = false) String password,
            @ApiParam(name = "email", value = "邮箱", required = false) @RequestParam(value = "email", required = false) String email,
            @ApiParam(name = "phone", value = "电话", required = false) @RequestParam(value = "phone", required = false) String phone

            ){
        return  userService.addUser(userid, username, password, email, phone);
    }

    @Cacheable(key = "'selectUser1'",value = "queryUser")
    @ApiOperation("根据Id查询用户")
    @GetMapping("/user/select")
    @ResponseBody
    public List<User> selsetUserById(
            @ApiParam(name = "userid", value = "用户ID", required = false) @RequestParam(value = "userid", required = false) Integer userid
    ){

        return  userService.queryUser(userid);

    }

    @ApiOperation("根据Id删除用户")
    @GetMapping("/user/delete")
    @ResponseBody
    public int deleteUserById(
            @ApiParam(name = "userid", value = "用户ID", required = false) @RequestParam(value = "userid", required = false) Integer userid
    ){

        return  userService.deleteUserById(userid);

    }

    @ApiOperation("修改用户")
    @RequestMapping(value="/user/update",method={ RequestMethod.GET })
    @ResponseBody
    public int updateUser(
            @ApiParam(name = "userid", value = "用户ID", required = false) @RequestParam(value = "userid", required = false) Integer userid,
            @ApiParam(name = "username", value = "用户名", required = false) @RequestParam(value = "username", required = false) String username,
            @ApiParam(name = "password", value = "密码", required = false) @RequestParam(value = "password", required = false) String password,
            @ApiParam(name = "email", value = "邮箱", required = false) @RequestParam(value = "email", required = false) String email,
            @ApiParam(name = "phone", value = "电话", required = false) @RequestParam(value = "phone", required = false) String phone

    ){
        return  userService.updateUser(userid, username, password, email, phone);
    }
//
//    @GetMapping("/user/borrow")
//    @ResponseBody
//    public List<User> selectBorrowById(){
//        return userService.selectBorrowById(1);
//    }

    @PostMapping("/user")
    public User user(){
        return new User();
    }


}
