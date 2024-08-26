package com.java.system.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderProduct {
    @Id
    @GeneratedValue
    @Column(name = "orderProduct_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderProducts", insertable=false, updatable=false)

    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderProducts", insertable=false, updatable=false)
    private Product product;
}
