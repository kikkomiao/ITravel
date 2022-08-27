package com.example.itravel.service;


import com.example.itravel.dao.OrdersMapper;
import com.example.itravel.entity.OrdersInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    public List<OrdersInfo> selectAll(int offset,int limit) {
        return ordersMapper.selectAll(offset,limit);
    }

    public List<OrdersInfo> selectByName(String name) {
        return ordersMapper.selectByName(name);
    }

    public List<OrdersInfo> selectByPhone(String phone) {
        return ordersMapper.selectByPhone(phone);
    }

    public int selectNum() {
        return ordersMapper.selectNum();
    }

}
