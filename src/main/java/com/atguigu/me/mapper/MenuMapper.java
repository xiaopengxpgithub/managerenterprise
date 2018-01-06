package com.atguigu.me.mapper;

import com.atguigu.me.entity.system.Menu;
import com.atguigu.me.util.PageData;

import java.util.List;

public interface MenuMapper {

    public void deleteMenuById(String MENU_ID) throws Exception;

    public PageData updateMenu(PageData pd);

    public PageData getMenuById(PageData pd) throws Exception;

    //取最大id
    public PageData findMaxId(PageData pd) throws Exception;

    public List<Menu> listAllParentMenu() throws Exception;

    public void insertMenu(Menu menu) throws Exception;

    public List<Menu> listSubMenuByParentId(String parentId) throws Exception;


    /**
     * 查找所有的子菜单
     * @return
     * @throws Exception
     */
    public List<Menu> listAllSubMenu() throws Exception;


    /**
     * 保存菜单图标 (顶部菜单)
     */
    public PageData editicon(PageData pd) throws Exception;

    /**
     * 更新子菜单类型菜单
     */
    public PageData editType(PageData pd) throws Exception;
}
