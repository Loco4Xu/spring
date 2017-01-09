package com.develop.controller;

import com.develop.mapper.UserMapper;
import com.develop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p class="detail">
 * 功能：
 * </p>
 *
 * @author Loco
 * @date 2017/1/6
 * @return
 */
@Controller
@RequestMapping("/loco/")
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        userService.hao();
//        userMapper.selectByPrimaryKey(1);
        System.out.println("nihao ");
        return "hello";
    }
}
