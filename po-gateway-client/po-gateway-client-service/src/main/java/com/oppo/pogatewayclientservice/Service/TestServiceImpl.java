package com.oppo.pogatewayclientservice.Service;

import com.oppo.pogatewayclientapi.api.TestService;
import com.oppo.pogatewayclientapi.entity.User;
import com.oppo.pogatewayclientservice.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Andy on 2021/6/4 22:55
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return "++";
    }

//    @Autowired
//     private TestMapper testMapper;
//
//    @Override
//    public User getUserById(Integer id) {
//        return testMapper.getUserById(id);
//    }
}
