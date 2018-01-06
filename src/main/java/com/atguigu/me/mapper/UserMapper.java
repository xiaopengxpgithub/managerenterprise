package com.atguigu.me.mapper;

import com.atguigu.me.entity.system.User;

public interface UserMapper {


    /*
    * 通过id获取数据
    */
    public User getUserAndRoleById(String USER_ID) throws Exception;

}
