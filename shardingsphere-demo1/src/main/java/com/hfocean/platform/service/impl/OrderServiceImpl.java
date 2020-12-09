package com.hfocean.platform.service.impl;

import com.hfocean.platform.core.po.OrderPo;
import com.hfocean.platform.mapper.OrderMapper;
import com.hfocean.platform.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    OrderMapper orderMapper;

    @Override
    public void add(OrderPo order) {
        orderMapper.insert(order);
    }

    @Override
    public OrderPo findById(Long orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }
}
