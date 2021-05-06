package com.snow.desensitize.dao.usertest;

import com.snow.desensitize.entity.usertest.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lx
 * @since 2021-04-29
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
 User Sel(int id);
}
