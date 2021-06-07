package com.oppo.pogatewayclientweb.service.impl;

import com.oppo.pogatewayclientweb.entity.User;
import com.oppo.pogatewayclientweb.mapper.UserMapper;
import com.oppo.pogatewayclientweb.service.UserService;
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
