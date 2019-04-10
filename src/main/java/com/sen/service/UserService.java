package com.sen.service;

import com.sen.mapper.ResPoolMapper;
import com.sen.modal.Pool;
import com.sen.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: liuxs
 * @description:
 * @date: Created in 8:13 PM  2018/12/17
 */
@Service
public class UserService {

    @Autowired
    private ResPoolMapper poolMapper;

    public User getUser(){
        User user = new User();
        user.setName("云霁科技");
        user.setAge(3);
        user.setSex("公司");
        return user;
    }

    public Pool getPool(String id) {
        return poolMapper.selectPool(id);
    }
}
