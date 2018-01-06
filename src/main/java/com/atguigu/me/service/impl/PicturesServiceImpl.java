package com.atguigu.me.service.impl;

import java.util.List;

import com.atguigu.me.entity.Page;
import com.atguigu.me.mapper.PicturesMapper;
import com.atguigu.me.service.IPicturesService;
import com.atguigu.me.util.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PicturesServiceImpl implements IPicturesService {

    @Autowired
    private PicturesMapper picturesMapper;

    /*
    * 新增
	*/
    public void save(PageData pd) throws Exception {
        picturesMapper.save(pd);
    }

    /*
    * 删除
    */
    public void delete(PageData pd) throws Exception {
        picturesMapper.delete(pd);
    }

    /*
    * 修改
    */
    public void edit(PageData pd) throws Exception {
        picturesMapper.edit(pd);
    }

    /*
    *列表
    */
    public List<PageData> list(Page page) throws Exception {
        return (List<PageData>) picturesMapper.datalistPage(page);
    }

    /*
    *列表(全部)
    */
    public List<PageData> listAll(PageData pd) throws Exception {
        return (List<PageData>) picturesMapper.listAll(pd);
    }

    /*
    * 通过id获取数据
    */
    public PageData findById(PageData pd) throws Exception {
        return (PageData) picturesMapper.findById(pd);
    }

    /*
    * 批量删除
    */
    public void deleteAll(String[] ArrayDATA_IDS) throws Exception {
        picturesMapper.deleteAll(ArrayDATA_IDS);
    }

    /*
    * 批量获取
    */
    public List<PageData> getAllById(String[] ArrayDATA_IDS) throws Exception {
        return (List<PageData>) picturesMapper.getAllById(ArrayDATA_IDS);
    }

    /*
    * 删除图片
    */
    public void delTp(PageData pd) throws Exception {
        picturesMapper.delTp(pd);
    }

}

