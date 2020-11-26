package com.msgsys.service;

import com.msgsys.entity.User;

/**
 * 作者：czw
 * 日期: 2020/11/26 20:31
 * 描述:
 */
public interface UserService {
    int register(User user);

    User login(User user);
}
