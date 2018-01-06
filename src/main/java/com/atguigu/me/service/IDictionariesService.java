package com.atguigu.me.service;

import com.atguigu.me.entity.Page;
import com.atguigu.me.util.PageData;

import java.util.List;

public interface IDictionariesService {

    //新增
    public void save(PageData pd) throws Exception;

    //修改
    public void edit(PageData pd) throws Exception;

    //通过id获取数据
    public PageData findById(PageData pd) throws Exception;

    //查询总数
    public PageData findCount(PageData pd) throws Exception;

    //查询某编码
    public PageData findBmCount(PageData pd) throws Exception;

    //列出同一父类id下的数据
    public List<PageData> dictlistPage(Page page) throws Exception;

    //删除
    public void delete(PageData pd) throws Exception;
}
