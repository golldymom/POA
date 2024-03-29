package com.sesacthon.poa.dto.mapper;

import com.sesacthon.poa.domain.WishlistEntity;
import com.sesacthon.poa.dto.WishlistDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WishlistMapper extends StructMapper<WishlistDto, WishlistEntity> {
}
