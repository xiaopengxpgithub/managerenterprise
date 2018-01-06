package com.atguigu.me.service;

import com.atguigu.me.entity.Page;
import com.atguigu.me.util.PageData;

import java.util.List;

public interface ITextmsgService {

    /*
    * 新增
    */
    public void save(PageData pd) throws Exception;

    /*
    * 删除
    */
    public void delete(PageData pd) throws Exception;

    /*
    * 修改
    */
    public void edit(PageData pd) throws Exception;

    /*
    *列表
    */
    public List<PageData> list(Page page) throws Exception;

    /*
    *列表(全部)
    */
    public List<PageData> listAll(PageData pd) throws Exception;

    /*
    * 通过id获取数据
    */
    public PageData findById(PageData pd) throws Exception;

    /*
    * 批量删除
    */
    public void deleteAll(String[] ArrayDATA_IDS) throws Exception;

    /*
    * 匹配关键词
    */
    public PageData findByKw(PageData pd) throws Exception;
}
