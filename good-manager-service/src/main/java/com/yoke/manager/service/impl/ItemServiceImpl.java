package com.yoke.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yoke.manager.dao.test.ItemMapper;
import com.yoke.manager.pojo.Item;
import com.yoke.manager.pojo.ItemExample;
import com.yoke.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ethereal
 * @create 2018-08-26-5:51 PM
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;


    @Override
    public Map<String, Object> getAll(int page, int rows) {
        Map<String, Object> map = new HashMap<>();
        PageInfo<Item> pageInfo = PageHelper.startPage(page, rows).doSelectPageInfo(() -> itemMapper.selectAll());
        map.put("items", pageInfo.getList());
        map.put("page", pageInfo.getPageNum());
        map.put("rows", pageInfo.getPageSize());
        map.put("count", pageInfo.getSize());
        return map;
    }

    @Override
    public List<Item> getAll() {
        return itemMapper.selectByExample(new ItemExample());
    }

    @Override
    public Item selectByPrimaryKey(String id) {
        return itemMapper.selectByPrimaryKey(id);
    }
}
