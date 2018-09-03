package com.yoke.manager.web.query;

import com.yoke.manager.pojo.Item;
import com.yoke.manager.service.ItemService;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author Ethereal
 * @create 2018-08-26-5:55 PM
 */
@Component
public class ItemQuery {
    @Autowired
    private ItemService itemService;

    @GraphQLQuery(name = "allItemWithPagination")
    public Map<String, Object> getAll(@GraphQLArgument(name = "page", defaultValue = "1") int page, @GraphQLArgument(name = "rows", defaultValue = "1") int rows) {
        return itemService.getAll(page, rows);
    }

    @GraphQLQuery(name = "allItem")
    public List<Item> getAll() {
        return itemService.getAll();
    }

    @GraphQLQuery(name = "item")
    public Item getItem(@GraphQLArgument(name = "id", description = "item id") String id) {
        return itemService.selectByPrimaryKey(id);
    }

}
