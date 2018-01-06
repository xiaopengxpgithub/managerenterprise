package com.atguigu.me.service.impl;

import java.util.List;

import com.atguigu.me.entity.Page;
import com.atguigu.me.mapper.AppuserMapper;
import com.atguigu.me.service.IAppuserService;
import com.atguigu.me.util.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AppuserServiceImpl implements IAppuserService {

    @Autowired
    private AppuserMapper appuserMapper;

    /*
    * 通过id获取数据
	*/
    public PageData findByUiId(PageData pd) throws Exception {
        return (PageData) appuserMapper.findByUiId(pd);
    }

    /*
    * 通过loginname获取数据
    */
    public PageData findByUId(PageData pd) throws Exception {
        return (PageData) appuserMapper.findByUId(pd);
    }

    /*
    * 通过邮箱获取数据
    */
    public PageData findByUE(PageData pd) throws Exception {
        return (PageData) appuserMapper.findByUE(pd);
    }

    /*
    * 通过编号获取数据
    */
    public PageData findByUN(PageData pd) throws Exception {
        return (PageData) appuserMapper.findByUN(pd);
    }

    /*
    * 保存用户
    */
    public void saveU(PageData pd) throws Exception {
        appuserMapper.saveU(pd);
    }

    /*
    * 修改用户
    */
    public void editU(PageData pd) throws Exception {
        appuserMapper.editU(pd);
    }

    /*
    * 删除用户
    */
    public void deleteU(PageData pd) throws Exception {
        appuserMapper.deleteU(pd);
    }

    /*
    * 批量删除用户
    */
    public void deleteAllU(String[] USER_IDS) throws Exception {
        appuserMapper.deleteAllU(USER_IDS);
    }

    /*
    *用户列表(全部)
    */
    public List<PageData> listAllUser(PageData pd) throws Exception {
        return (List<PageData>) appuserMapper.listAllUser(pd);
    }

    /*
    *用户列表(用户组)
    */
    public List<PageData> listPdPageUser(Page page) throws Exception {
        return (List<PageData>) appuserMapper.userlistPage(page);
    }

    /*
    * 保存用户IP
    */
    public void saveIP(PageData pd) throws Exception {
        appuserMapper.saveIP(pd);
    }

    /*
    * 登录判断
    */
    public PageData getUserByNameAndPwd(PageData pd) throws Exception {
        return (PageData) appuserMapper.getUserInfo(pd);
    }

    /*
    * 跟新登录时间
    */
    public void updateLastLogin(PageData pd) throws Exception {
        appuserMapper.updateLastLogin(pd);
    }

}

