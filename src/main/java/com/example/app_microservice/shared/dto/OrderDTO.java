package com.example.app_microservice.shared.dto;

public class OrderDTO {
    private int orderId;
    private String product;
    private int userId;

    public OrderDTO(int orderId, String product, int userId) {
        this.orderId = orderId;
        this.product = product;
        this.userId = userId;
    }

    public OrderDTO(String product, int userId) {
        this.product = product;
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
