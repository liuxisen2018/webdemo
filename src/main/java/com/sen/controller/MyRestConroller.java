package com.sen.controller;

import com.sen.modal.Pool;
import com.sen.modal.User;
import com.sen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: liuxs
 * @description: just test controller
 * @date: Created in 6:38 PM  2018/11/10
 */
@Controller
@RequestMapping(value="/users")
public class MyRestConroller {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    @ResponseBody
    public User getUser(){
       User user = userService.getUser();
       return user;
   }

    @RequestMapping(value="/pool", method= RequestMethod.GET)
    @ResponseBody
    public Pool getPool(){
        return userService.getPool("057dc66c-0869-4f47-b7c5-bae828b1262e");
    }

}
