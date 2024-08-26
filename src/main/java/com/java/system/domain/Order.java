package com.java.system.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private long id;
    private boolean status;
    private String orderer;

    private boolean isDeliveried;


    // 배송 정보

    // 테이블 관계 설정
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", insertable=false, updatable=false)
    private Member member;

    @OneToMany(mappedBy = "order")
    @Column(insertable=false, updatable=false)
    private List<OrderProduct> orderProducts = new ArrayList<>();
}
