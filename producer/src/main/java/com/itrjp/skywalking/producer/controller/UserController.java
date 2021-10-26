package com.itrjp.skywalking.producer.controller;

import com.itrjp.skywaling.bean.User;
import com.itrjp.skywalking.producer.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户service
 *
 * @author renjp
 * @date 2021/10/26 11:39
 */
@RestController()
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    public User getOne(@PathVariable String id) {

        return userService.getOne(id);
    }
}
