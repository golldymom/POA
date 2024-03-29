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
@Table(name = "Artwork")
public class ArtworkEntity extends BaseTimeEntity { // 작품 테이블
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer artwork_id;

    @Column(nullable = false)
    private Integer user_id; // 작가 id

    @Column(nullable = false)
//    private Integer file_id;
    private String file_url;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    private Integer artwork_price;

    private String artwork_size;

    private Integer artwork_state; // 0:판매완료 / 1:판매중

    @Column(columnDefinition = "TINYINT", length=1)
    private int visible; // true,1: 공개허용 / false,0: 비허용

    private String user_name;

    @Builder
    public ArtworkEntity(Integer artwork_id, Integer user_id, String file_url, String title, String content, Integer artwork_price, String artwork_size, Integer artwork_state, int visible, String user_name) {
        this.artwork_id = artwork_id;
        this.user_id = user_id;
        this.file_url = file_url;
        this.title = title;
        this.content = content;
        this.artwork_price = artwork_price;
        this.artwork_size = artwork_size;
        this.artwork_state = artwork_state;
        this.visible = visible;
        this.user_name = user_name;
    }
}
