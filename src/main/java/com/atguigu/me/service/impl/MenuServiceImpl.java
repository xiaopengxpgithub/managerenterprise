package com.atguigu.me.service.impl;

import java.util.List;

import com.atguigu.me.entity.system.Menu;
import com.atguigu.me.mapper.MenuMapper;
import com.atguigu.me.service.IMenuService;
import com.atguigu.me.util.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    public void deleteMenuById(String MENU_ID) throws Exception {
        menuMapper.deleteMenuById(MENU_ID);

    }

    public PageData getMenuById(PageData pd) throws Exception {
        return (PageData) menuMapper.getMenuById(pd);

    }

    //取最大id
    public PageData findMaxId(PageData pd) throws Exception {
        return (PageData) menuMapper.findMaxId(pd);
    }

    public List<Menu> listAllParentMenu() throws Exception {
        return (List<Menu>) menuMapper.listAllParentMenu();
    }

    public void saveMenu(Menu menu) throws Exception {
        if (menu.getMENU_ID() != null && menu.getMENU_ID() != "") {
            //dao.update("MenuMapper.updateMenu", menu);
            menuMapper.insertMenu(menu);
        } else {
            menuMapper.insertMenu(menu);
        }
    }

    public List<Menu> listSubMenuByParentId(String parentId) throws Exception {
        return (List<Menu>) menuMapper.listSubMenuByParentId(parentId);
    }

    public List<Menu> listAllMenu() throws Exception {
        List<Menu> rl = this.listAllParentMenu();
        for (Menu menu : rl) {
            List<Menu> subList = this.listSubMenuByParentId(menu.getMENU_ID());
            menu.setSubMenu(subList);
        }
        return rl;
    }

    public List<Menu> listAllSubMenu() throws Exception {
        return (List<Menu>) menuMapper.listAllSubMenu();
    }

    /**
     * 编辑
     */
    public PageData edit(PageData pd) throws Exception {
        return (PageData) menuMapper.updateMenu(pd);
    }

    /**
     * 保存菜单图标 (顶部菜单)
     */
    public PageData editicon(PageData pd) throws Exception {
        return (PageData) menuMapper.editicon(pd);
    }

    /**
     * 更新子菜单类型菜单
     */
    public PageData editType(PageData pd) throws Exception {
        return (PageData) menuMapper.editType(pd);
    }
}
