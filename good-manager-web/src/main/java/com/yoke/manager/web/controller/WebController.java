package com.yoke.manager.web.controller;

import com.yoke.manager.dao.test.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    private AddressMapper addressMapper;

    @GetMapping("/test")
    public String test() {
        return "te";
    }
}
