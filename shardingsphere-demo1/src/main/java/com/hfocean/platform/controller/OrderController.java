package com.hfocean.platform.controller;

import com.hfocean.platform.core.po.OrderPo;
import com.hfocean.platform.core.util.IdWorker;
import com.hfocean.platform.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/add")
    public OrderPo add(){
        OrderPo order = new OrderPo();
        order.setMemberId(IdWorker.getLongId());
        order.setOrderAmount("50.0");
        order.setOrderCode("1212");
        //order.setOrderId(IdWorker.getLongId());
        order.setStatus("1");
        order.setCreateTime(new Date());
        orderService.add(order);
        return order;
    }

    @RequestMapping("/findById")
    public OrderPo findById(Long orderId){
        return orderService.findById(orderId);
    }

}
