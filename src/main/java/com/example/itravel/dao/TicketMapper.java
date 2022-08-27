package com.example.itravel.dao;

import java.util.List;

import com.example.itravel.entity.Ticket;

// import com.example.itravel.entity.Tourist;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TicketMapper {

    List<Ticket> selectTicket();

    List<Ticket> selectById(String id);

    int updateTicket(String touristId);
    int insert(Ticket ticket);
    int update111(Object id,int num, float price,String type);

    int deleteById(String tid, String name);

}
