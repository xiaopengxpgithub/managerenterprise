package com.atguigu.me.util;

import com.atguigu.me.service.impl.UserServiceImpl;
import com.atguigu.me.service.impl.MenuServiceImpl;
import com.atguigu.me.service.impl.RoleServiceImpl;


/**
 * 获取Spring容器中的service bean
 *
 * @author xiaopeng
 */
public final class ServiceHelper {

    public static Object getService(String serviceName) {
        //WebApplicationContextUtils.
        return Const.WEB_APP_CONTEXT.getBean(serviceName);
    }

    public static UserServiceImpl getUserService() {
        return (UserServiceImpl) getService("userService");
    }

    public static RoleServiceImpl getRoleService() {
        return (RoleServiceImpl) getService("roleService");
    }

    public static MenuServiceImpl getMenuService() {
        return (MenuServiceImpl) getService("menuService");
    }
}
