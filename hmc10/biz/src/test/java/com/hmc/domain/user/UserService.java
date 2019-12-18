package com.hmc.domain.user;

import com.hmc.api.command.CreateUserCommand;
import com.hmc.api.si.UserServiceInterface;

/**
 * Author:meice Huang
 * Time: 2019-10-31 21:04
 */
public class UserService implements UserServiceInterface {
    @Override
    public void createUser(CreateUserCommand cmd) {

    }

    @Override
    public void sort() {
        System.out.println("重写接口默认的sort()方法...");

        System.out.println("YES".length());
    }
}

