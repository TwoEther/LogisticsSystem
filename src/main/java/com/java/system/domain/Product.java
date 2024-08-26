package com.java.system.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private long id;
    private String name;
    private int quantity;

    // 창고 ID
    private long storageId;

    // 테이블 관계 설정
    @OneToMany
    private List<StorageProduct> storageProductList = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<OrderProduct> orderProducts = new ArrayList<>();

    public Product(long id, String name, int quantity, long storageId) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.storageId = storageId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getStorageId() {
        return storageId;
    }
}
