package com.yoke.manager.web.controller;

import com.yoke.manager.dao.AddressMapper;
import com.yoke.manager.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    private AddressMapper addressMapper;

    @GetMapping("/test")
    public Address test() {
        return addressMapper.selectByPrimaryKey(1);
    }
}