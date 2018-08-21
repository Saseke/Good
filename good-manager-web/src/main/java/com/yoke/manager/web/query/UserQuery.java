package com.yoke.manager.web.query;

import com.yoke.manager.pojo.User;
import com.yoke.manager.service.UserService;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserQuery {
    @Autowired
    private UserService userService;

    @GraphQLQuery(name = "getAllUsers")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }
}
