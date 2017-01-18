package com.cnotes.controller;

import com.cnotes.repository.OrderQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by trimup on 2017/1/18.
 */
@RestController
@RequestMapping(value = "/data")
public class DataController {


    @Autowired
    private OrderQueryRepository orderQueryRepository;


    @Cacheable
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insertOrder()
    {
        orderQueryRepository.findByName()

    }
}
