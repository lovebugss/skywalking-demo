package com.itrjp.skywalking.producer.service;

import com.itrjp.skywaling.bean.User;
import org.springframework.stereotype.Service;

/**
 * user service
 *
 * @author renjp
 * @date 2021/10/26 11:42
 */
@Service
public class UserService {
    public User getOne(String id) {
        User user = new User();
        user.setId(id);
        user.setUsername("zhangsan");
        user.setAge(18);
        return user;
    }
}
