package com.yoke.manager.service;

import com.yoke.manager.pojo.Item;

import java.util.List;
import java.util.Map;

/**
 * @author Ethereal
 * @create 2018-08-26-5:50 PM
 */
public interface ItemService {


    Map<String, Object> getAll(int page, int rows);

    List<Item> getAll();

    Item selectByPrimaryKey(String id);
}
