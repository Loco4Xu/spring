package com.develop.controller;

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

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        System.out.println("nihao ");
        return "hello";
    }
}
