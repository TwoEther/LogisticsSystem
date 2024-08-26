package com.java.system.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/*
    창고
 */
@Entity
@Getter
public class Storage {
    @Id
    @Column(name = "storage_number")
    private int number;

    private String locate;
    private double capacity;

    private boolean status;

    // 테이블 관계 설정
    @OneToMany
    private List<StorageProduct> storageProductList = new ArrayList<>();

    @OneToOne
    private Member member;

    public Storage() {
    }

    public Storage(int number, String locate, double capacity, boolean status) {
        this.number = number;
        this.locate = locate;
        this.capacity = capacity;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "number=" + number +
                ", locate='" + locate + '\'' +
                ", capacity=" + capacity +
                ", status=" + status +
                '}';
    }
}
