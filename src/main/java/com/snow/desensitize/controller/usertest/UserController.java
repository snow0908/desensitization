package com.snow.desensitize.controller.usertest;


import com.snow.desensitize.entity.usertest.User;
import com.snow.desensitize.service.usertest.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lx
 * @since 2021-04-29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("用户查询接口")
    @RequestMapping("getUser/{id}")
    public User GetUser(@PathVariable int id){
        return userService.Sel(id);
    }
}

