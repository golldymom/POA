package com.sesacthon.poa.controller;

import com.sesacthon.poa.dto.ArtworkDto;
import com.sesacthon.poa.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
@Slf4j
public class PoaController2 {
    private final ArtworkService artworkService; //
    private final WishlistService wishlistService; //

    /**
     * 1개의 아트의 정보 전달
     * @param artwork_id
     * @return ArtworkDto
     */
    @ResponseBody
    @GetMapping("/artwork")
    public ArtworkDto findArtwork(@RequestParam Integer artwork_id) {
        return artworkService.findArtwork(artwork_id);
    }

    /**
     * 1명의 유저가 좋아요한 리스트
     * @param user_id
     * @return List<ArtworkDto>
     */
    @ResponseBody
    @GetMapping("/artwork/wishlist")
    public List<ArtworkDto> getArtworkByUserId(@RequestParam Integer user_id) {
       return artworkService.getArtworkByUserId(user_id);
    }

//1개의 작품에 좋아요한 갯수

//좋아요 많은 순서대로 필터링한 리스트


//    BuyInfo controller
//1명이 산 구매 리스트 전달
//@ResponseBody
//@GetMapping("/buyinfo")
//public ArtworkDto findArtwork(@RequestBody Integer artwork_id){
//    return artworkService.findArtwork(artwork_id);
//}

//
//1명이 산 특정한 구매 아이템 정보


//    작가가 판매한 아이템
}