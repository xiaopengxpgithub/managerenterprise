package com.atguigu.me.service;

import com.atguigu.me.entity.system.Menu;
import com.atguigu.me.util.PageData;

import java.util.List;

public interface IMenuService {

    public void deleteMenuById(String MENU_ID) throws Exception;

    public PageData getMenuById(PageData pd) throws Exception;

    //取最大id
    public PageData findMaxId(PageData pd) throws Exception;

    public List<Menu> listAllParentMenu() throws Exception;

    public void saveMenu(Menu menu) throws Exception;

    public List<Menu> listSubMenuByParentId(String parentId) throws Exception;

    public List<Menu> listAllMenu() throws Exception;

    public List<Menu> listAllSubMenu() throws Exception;

    /**
     * 编辑
     */
    public PageData edit(PageData pd) throws Exception;

    /**
     * 保存菜单图标 (顶部菜单)
     */
    public PageData editicon(PageData pd) throws Exception;

    /**
     * 更新子菜单类型菜单
     */
    public PageData editType(PageData pd) throws Exception;
}
