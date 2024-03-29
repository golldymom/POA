package com.sesacthon.poa.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "BuyInfo")
public class BuyInfoEntity extends BaseTimeEntity { // 구매정보 테이블
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer buyInfo_id;

    @Column(nullable = false)
    private Integer artwork_id;

    @Column(nullable = false)
    private Integer user_id;

    @Column(nullable = false)
    private String buy_address;

    @Column(nullable = false)
    private Integer pay_price;

//    @Column(nullable = false)
//    private String pay_date;

//    private int visible;// true,1: 공개허용 / false,0: 비허용

    private Integer buy_state;// 1: 결재완료 / 0: 결재취소 /다른거 추후 추가


    @Builder
    public BuyInfoEntity(Integer buyInfo_id, Integer artwork_id, Integer user_id, String buy_address, Integer pay_price, Integer buy_state) {
        this.buyInfo_id = buyInfo_id;
        this.artwork_id = artwork_id;
        this.user_id = user_id;
        this.buy_address = buy_address;
        this.pay_price = pay_price;
        this.buy_state = buy_state;
    }
}
