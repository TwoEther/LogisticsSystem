# 물류 자동화 프로그램 구현

----

## 데이터 베이스 설계
* 창고
  * 창고 고유번호, 위치, 용량, 상태 등
* 재고(상품)
  * ID, 제품명, 수량, 창고 ID 등
* 주문
  * ID, 주문 상태, 고객 정보, 배송 정보 등
* 배송
  * ID, 주문 ID, 배송 상태, 운송 정보 등
* 회원
  * 슈퍼 관리자, 관리자, 일반 유저 등 
  * 슈퍼 관리자
    * 프로그램 기능에 대한 총체적 관리 (기능)
  * 관리자
    * 관리자는 창고에 대한 관리 권한을 가짐
    * 슈퍼 관리자에게 상품 추가 및 삭제 요청 가능
  * 일반 유저
    * 재고를 조회하는 쪽으로 주문 가능

## 서비스 기능
* 재고 관리
  * 제품 입고, 출고, 재고 조정 등
* 주문 처리
  * 주문 접수, 재고 확인, 출고 준비, 배송 준비 등
* 배송 관리
  * 운송 수단, 운송 경로, 배송 추적 관리

## 서비스 계층
위의 기능들을 구현


## 자동화
Spring Batch를 사용해 정기적인 자동화 작업 수행


## 엔티티 관계

#### 창고 - 재고(상품)
* 하나의 창고 에는 여러개 의 상품이 들어감 
* 하나의 상품은 여러개 의 창고에 들어갈 수 있음
* N : M 관계의 매핑을 가짐
* N : M 관계의 ORM을 설계할 수 있으나 성능 및 여러가지 이슈를 통해 N : 1 : M 관계로 분리

# 기술 스택
  * Java, Spring
  * PostgreSQL
  * JPA, Spring Security
  * Thymeleaf

# 개발일지
* 2024-08-25
  * 스프링 프로젝트 구성 및 환경설정
  * 도메인 작성 및 연관 관계에 따른 테스트 시나리오 작성
    1. 관리자 회원
       * 상품 및 공장 추가 로직

Spring bean JPA