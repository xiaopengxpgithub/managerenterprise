package com.atguigu.me.service.impl;

import java.util.List;


import com.atguigu.me.entity.Page;
import com.atguigu.me.mapper.CommandMapper;
import com.atguigu.me.service.ICommandService;
import com.atguigu.me.util.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommandServiceImpl implements ICommandService {

    @Autowired
    private CommandMapper commandMapper;

    /*
    * 新增
    */
    public void save(PageData pd) throws Exception {
        commandMapper.save(pd);
    }

    /*
    * 删除
    */
    public void delete(PageData pd) throws Exception {
        commandMapper.delete(pd);
    }

    /*
    * 修改
    */
    public void edit(PageData pd) throws Exception {
        commandMapper.edit(pd);
    }

    /*
    *列表
    */
    public List<PageData> list(Page page) throws Exception {
        return (List<PageData>) commandMapper.datalistPage(page);
    }

    /*
    *列表(全部)
    */
    public List<PageData> listAll(PageData pd) throws Exception {
        return (List<PageData>) commandMapper.listAll(pd);
    }

    /*
    * 通过id获取数据
    */
    public PageData findById(PageData pd) throws Exception {
        return (PageData) commandMapper.findById(pd);
    }

    /*
    * 批量删除
    */
    public void deleteAll(String[] ArrayDATA_IDS) throws Exception {
        commandMapper.deleteAll(ArrayDATA_IDS);
    }

    /*
    * 匹配关键词
    */
    public PageData findByKw(PageData pd) throws Exception {
        return (PageData) commandMapper.findByKw(pd);
    }
}

