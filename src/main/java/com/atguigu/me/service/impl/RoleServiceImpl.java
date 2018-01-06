package com.atguigu.me.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.atguigu.me.entity.system.Role;
import com.atguigu.me.mapper.RoleMapper;
import com.atguigu.me.service.IRoleService;
import com.atguigu.me.util.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.me.util.PageData;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    public List<Role> listAllERRoles() throws Exception {
        return (List<Role>) roleMapper.listAllERRoles();
    }


    public List<Role> listAllappERRoles() throws Exception {
        return (List<Role>) roleMapper.listAllappERRoles();
    }


    public List<Role> listAllRoles() throws Exception {
        return (List<Role>) roleMapper.listAllRoles();
    }

    //通过当前登录用的角色id获取管理权限数据
    public PageData findGLbyrid(PageData pd) throws Exception {
        return (PageData) roleMapper.findGLbyrid(pd);
    }

    //通过当前登录用的角色id获取用户权限数据
    public PageData findYHbyrid(PageData pd) throws Exception {
        return (PageData) roleMapper.findYHbyrid(pd);
    }

    //列出此角色下的所有用户
    public List<PageData> listAllUByRid(PageData pd) throws Exception {
        return (List<PageData>) roleMapper.listAllUByRid(pd);
    }

    //列出此角色下的所有会员
    public List<PageData> listAllAppUByRid(PageData pd) throws Exception {
        return (List<PageData>) roleMapper.listAllAppUByRid(pd);
    }

    /**
     * 列出此部门的所有下级
     */
    public List<Role> listAllRolesByPId(PageData pd) throws Exception {
        return (List<Role>) roleMapper.listAllRolesByPId(pd);
    }

    //列出K权限表里的数据
    public List<PageData> listAllkefu(PageData pd) throws Exception {
        return (List<PageData>) roleMapper.listAllkefu(pd);
    }

    //列出G权限表里的数据
    public List<PageData> listAllGysQX(PageData pd) throws Exception {
        return (List<PageData>) roleMapper.listAllGysQX(pd);
    }

    //删除K权限表里对应的数据
    public void deleteKeFuById(String ROLE_ID) throws Exception {
        roleMapper.deleteKeFuById(ROLE_ID);
    }

    //删除G权限表里对应的数据
    public void deleteGById(String ROLE_ID) throws Exception {
        roleMapper.deleteGById(ROLE_ID);
    }

    public void deleteRoleById(String ROLE_ID) throws Exception {
        roleMapper.deleteRoleById(ROLE_ID);
    }

    public Role getRoleById(String roleId) throws Exception {
        return (Role) roleMapper.getRoleById(roleId);
    }

    public void updateRoleRights(Role role) throws Exception {
        roleMapper.updateRoleRights(role);
    }

    /**
     * 权限(增删改查)
     */
    public void updateQx(String msg, PageData pd) throws Exception {
        switch (msg) {
            case "add_qx":
                roleMapper.add_qx(pd);
                break;
            case "del_qx":
                roleMapper.del_qx(pd);
                break;
            case "edit_qx":
                roleMapper.edit_qx(pd);
                break;
            case "cha_qx":
                roleMapper.cha_qx(pd);
                break;
            default:
                Logger.getLogger(this.getClass()).info("参数错误");
                break;
        }
    }

    /**
     * 客服权限
     */
    public void updateKFQx(String msg, PageData pd) throws Exception {
        //roleMapper.update("RoleMapper." + msg, pd);

        switch (msg) {
            case "kfqx1":
                roleMapper.kfqx1(pd);
                break;
            case "kfqx2":
                roleMapper.kfqx2(pd);
                break;
            case "fxqx":
                roleMapper.fxqx(pd);
                break;
            case "fwqx":
                roleMapper.fwqx(pd);
                break;
            default:
                Logger.getLogger(this.getClass()).info("参数错误");
                break;
        }
    }

    /**
     * Gc权限
     */
    public void gysqxc(String msg, PageData pd) throws Exception {
        //dao.update("RoleMapper." + msg, pd);
    }

    /**
     * 给全部子职位加菜单权限
     */
    public void setAllRights(PageData pd) throws Exception {
        roleMapper.setAllRights(pd);

    }

    /**
     * 添加
     */
    public void add(PageData pd) throws Exception {
        roleMapper.insert(pd);
    }

    /**
     * 保存客服权限
     */
    public void saveKeFu(PageData pd) throws Exception {
        roleMapper.saveKeFu(pd);
    }

    /**
     * 保存G权限
     */
    public void saveGYSQX(PageData pd) throws Exception {
        roleMapper.saveGYSQX(pd);
    }

    /**
     * 通过id查找
     */
    public PageData findObjectById(PageData pd) throws Exception {
        return (PageData) roleMapper.findObjectById(pd);
    }

    /**
     * 编辑角色
     */
    public PageData edit(PageData pd) throws Exception {
        return (PageData) roleMapper.edit(pd);
    }

}
