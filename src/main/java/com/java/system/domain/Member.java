package com.java.system.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/*
    회원에 대한 공통속성
 */
@Entity
public class Member {
    @Id
    @GeneratedValue
    private long id;
    private String userId;
    private String password;

    // 테이블 관계 설정
    @OneToOne(mappedBy = "member")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storage_id")
    private Storage storage;
}
