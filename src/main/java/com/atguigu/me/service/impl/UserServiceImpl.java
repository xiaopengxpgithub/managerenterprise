package com.atguigu.me.service.impl;

import java.util.List;


import com.atguigu.me.mapper.UserMapper;
import com.atguigu.me.mapper.UserXMapper;
import com.atguigu.me.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.me.entity.Page;
import com.atguigu.me.entity.system.User;
import com.atguigu.me.util.PageData;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserXMapper userXMapper;

    /*
    * 通过id获取数据
    */
    public PageData findByUiId(PageData pd) throws Exception {
        return (PageData) userXMapper.findByUiId(pd);
    }

    /*
    * 通过loginname获取数据
    */
    public PageData findByUId(PageData pd) throws Exception {
        return (PageData) userXMapper.findByUId(pd);
    }

    /*
    * 通过邮箱获取数据
    */
    public PageData findByUE(PageData pd) throws Exception {
        return (PageData) userXMapper.findByUE(pd);
    }

    /*
    * 通过编号获取数据
    */
    public PageData findByUN(PageData pd) throws Exception {
        return (PageData) userXMapper.findByUN(pd);
    }

    /*
    * 保存用户
    */
    public void saveU(PageData pd) throws Exception {
        userXMapper.saveU(pd);
    }

    /*
    * 修改用户
    */
    public void editU(PageData pd) throws Exception {
        userXMapper.editU(pd);
    }

    /*
    * 换皮肤
    */
    public void setSKIN(PageData pd) throws Exception {
        userXMapper.setSKIN(pd);
    }

    /*
    * 删除用户
    */
    public void deleteU(PageData pd) throws Exception {
        userXMapper.deleteU(pd);
    }

    /*
    * 批量删除用户
    */
    public void deleteAllU(String[] USER_IDS) throws Exception {
        userXMapper.deleteAllU(USER_IDS);
    }

    /*
    *用户列表(用户组)
    */
    public List<PageData> listPdPageUser(Page page) throws Exception {
        return (List<PageData>) userXMapper.userlistPage(page);
    }

    /*
    *用户列表(全部)
    */
    public List<PageData> listAllUser(PageData pd) throws Exception {
        return (List<PageData>) userXMapper.listAllUser(pd);
    }

    /*
    *用户列表(供应商用户)
    */
    public List<PageData> listGPdPageUser(Page page) throws Exception {
        //return (List<PageData>) userXMapper.userGlistPage(page);
        return null;
    }

    /*
    * 保存用户IP
    */
    public void saveIP(PageData pd) throws Exception {
        userXMapper.saveIP(pd);
    }

    /*
    * 登录判断
    */
    public PageData getUserByNameAndPwd(PageData pd) throws Exception {
        return (PageData) userXMapper.getUserInfo(pd);
    }

    /*
    * 跟新登录时间
    */
    public void updateLastLogin(PageData pd) throws Exception {
        userXMapper.updateLastLogin(pd);
    }

    /*
    *通过id获取数据
    */
    public User getUserAndRoleById(String USER_ID) throws Exception {
        return (User) userMapper.getUserAndRoleById(USER_ID);
    }

}
