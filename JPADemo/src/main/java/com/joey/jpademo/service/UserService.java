package com.joey.jpademo.service;

import com.joey.jpademo.entity.User;

/**
 * @author Joey
 * @date 2018-06-19 16:33
 * @desc UserService
 **/
public interface UserService {
    User getOne(Long id);

    User save(User user);

}
