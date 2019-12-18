package com.hmc.api.si;

import com.hmc.api.command.CreateUserCommand;
import com.hmc.api.command.UpdateUserCommand;

/**
 * Author:meice Huang
 * Time: 2019-10-31 21:03
 */
public interface UserServiceInterface {

    void createUser(CreateUserCommand  cmd);


    default void sort(){
        System.out.println("这是一个默认实现");
    }
}
