package com.hfocean.platform.core.po;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table( name ="t_order_item" )
public class OrderItemPo {

    @Id
    //单库单表，可使用数据库自增来保证ID唯一性
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private Long orderId;

    private String productName;

    private Double itemAccount;

    private Date createTime;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getItemAccount() {
        return itemAccount;
    }

    public void setItemAccount(Double itemAccount) {
        this.itemAccount = itemAccount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
