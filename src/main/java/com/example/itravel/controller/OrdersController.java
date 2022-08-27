package com.example.itravel.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.itravel.entity.OrderStatus;
import com.example.itravel.entity.OrdersInfo;
import com.example.itravel.service.OrderStatusService;
import com.example.itravel.service.OrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrdersController {

    @Autowired
    private OrdersService ordersService;
    @Autowired
    private OrderStatusService orderStatusService;

    @RequestMapping(path = "/orderIfn",method = RequestMethod.GET)
    public String getOrderPage(Model model){

        // page.setLimit(5);
        // page.setPath("/orderIfn");
        // page.setRows(ordersService.selectNum());
        // List<OrdersInfo> list = ordersService.selectAll(page.getOffset(), page.getLimit());
        List<OrdersInfo> list = ordersService.selectAll(0,0);
        List<Map<String, Object>> maps = new ArrayList<>();
        if(list!=null){
            for(OrdersInfo t:list){
                Map<String,Object> map = new HashMap<>();
                map.put("ordersInfo",t);
                maps.add(map);
            }
        }
        model.addAttribute("ordersInfo1",maps);
        System.out.println(maps);
        return "order_info";
    }

    @RequestMapping(path = "/operating",method = RequestMethod.GET)
    public  String getStatus(Model model){

        List<OrderStatus> list1=orderStatusService.selectView();
        List<OrderStatus> list2=orderStatusService.selectSum();
        model.addAttribute("list1",list1);
        model.addAttribute("list2",list2);

        return "status";
    }
    @RequestMapping(path = "/orderIfn/{searchId}", method = RequestMethod.GET)
    public String search(Model model,@PathVariable("searchId") String searchId,String phone,String name){
        List<OrdersInfo> list;
        if (searchId.equals("search3")) {
            list = ordersService.selectByPhone(phone);
        }
        else {
            list=ordersService.selectByName(name);
        }

        List<Map<String, Object>> maps = new ArrayList<>();
        if(list!=null){
            for(OrdersInfo t:list){
                Map<String,Object> map = new HashMap<>();
                map.put("ordersInfo",t);
                maps.add(map);
            }
        }
        model.addAttribute("ordersInfo1",maps);
        return "order_info";
    }

}
