package com.hfocean.platform.service;

import com.hfocean.platform.core.po.OrderPo;

public interface IOrderService {

    void add(OrderPo order);

    OrderPo findById(Long orderId);
}
