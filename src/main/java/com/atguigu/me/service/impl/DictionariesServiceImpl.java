package com.atguigu.me.service.impl;

import java.util.List;

import com.atguigu.me.mapper.DictionariesMapper;
import com.atguigu.me.service.IDictionariesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.me.entity.Page;
import com.atguigu.me.util.PageData;

@Service
public class DictionariesServiceImpl implements IDictionariesService {

    @Autowired
    private DictionariesMapper dictionariesMapper;

    //新增
    public void save(PageData pd) throws Exception {
        dictionariesMapper.save(pd);
    }

    //修改
    public void edit(PageData pd) throws Exception {
        dictionariesMapper.edit(pd);
    }

    //通过id获取数据
    public PageData findById(PageData pd) throws Exception {
        return (PageData) dictionariesMapper.findById(pd);
    }

    //查询总数
    public PageData findCount(PageData pd) throws Exception {
        return (PageData) dictionariesMapper.findCount(pd);
    }

    //查询某编码
    public PageData findBmCount(PageData pd) throws Exception {
        return (PageData) dictionariesMapper.findBmCount(pd);
    }

    //列出同一父类id下的数据
    public List<PageData> dictlistPage(Page page) throws Exception {
        return (List<PageData>) dictionariesMapper.dictlistPage(page);
    }

    //删除
    public void delete(PageData pd) throws Exception {
        dictionariesMapper.delete(pd);
    }


}
