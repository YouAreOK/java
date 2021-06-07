package com.oppo.pogatewayclientservice.service.userService;

import com.oppo.pogatewayclientapi.entity.User;
import com.oppo.pogatewayclientservice.mapper.UserMapper;
import com.oppo.pogatewayclientapi.api.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Andy
 * @since 2021-06-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
