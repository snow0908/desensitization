package com.snow.desensitize.service.impl.usertest;

import com.snow.desensitize.entity.usertest.User;
import com.snow.desensitize.dao.usertest.UserMapper;
import com.snow.desensitize.service.usertest.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lx
 * @since 2021-04-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User Sel(int id) {
//        return getById(id);
        return userMapper.Sel(id);
    }
    @Override
    public List<User> selectlist() {
//        return getById(id);
        return super.list();
    }
}
