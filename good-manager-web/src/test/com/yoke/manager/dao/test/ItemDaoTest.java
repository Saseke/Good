package com.yoke.manager.dao.test;

import com.yoke.manager.web.GoodManagerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ethereal
 * @create 2018-08-26-9:08 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GoodManagerApplication.class)
public class ItemDaoTest {
    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void select() {
        itemMapper.selectByPrimaryKey("q");
    }
}
