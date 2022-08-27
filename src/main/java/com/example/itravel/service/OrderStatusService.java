package com.example.itravel.service;


import java.util.List;

import com.example.itravel.dao.OrderStatusMapper;
import com.example.itravel.entity.OrderStatus;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusService {
    @Autowired
    private OrderStatusMapper statusMapper;

    public List<OrderStatus> selectView(){
        return statusMapper.selectView();
    }
    public List<OrderStatus>selectSum(){
        return statusMapper.selectSum();
    }

}
