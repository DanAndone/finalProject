package com.onlineshop.business.orderstatus;

import com.onlineshop.business.orderstatus.domain.OrderStatus;
import com.onlineshop.business.orderstatus.domain.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


public class OrderStatusServiceImpl implements OrderStatusService{

    @Autowired()
    OrderStatusRepository orderStatusRepository;

    @Override
    public List<OrderStatus> getAllOrderStatuses() {
        return orderStatusRepository.findAll();
    }
}
