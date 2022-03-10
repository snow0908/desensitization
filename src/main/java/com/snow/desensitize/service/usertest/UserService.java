package com.snow.desensitize.service.usertest;

import com.snow.desensitize.entity.usertest.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lx
 * @since 2021-04-29
 */
public interface UserService extends IService<User> {
    User Sel(int id);
    List<User> selectlist();
}
