package com.itrjp.skywalking.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author renjp
 * @date 2021/10/26 16:51
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @GetMapping("{id}")
    public String getOne(@PathVariable String id) {
        log.info("id: [{}]", id);
        return "id: " + id;
    }
}
