package com.java.system.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class StorageProduct {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Storage storage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Product product;

}
