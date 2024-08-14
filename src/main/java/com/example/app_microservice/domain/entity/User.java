package com.example.app_microservice.domain.entity;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String email;
    private List<Order> orderList;

    public User(int id, String name, String email, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.orderList = orderList;
    }

    public User(String name, String email, List<Order> orderList) {
        this.name = name;
        this.email = email;
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
