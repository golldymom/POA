package com.sesacthon.poa.repository;

import com.sesacthon.poa.domain.ArtworkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArtworkRepository extends JpaRepository<ArtworkEntity, Integer> {

    /**
     * 예시 입니다!!
     * 기본 JPA 사용시 밑에처럼 작성 안해도 됩니다! (ex. findById(), findAll(), save(), ...)
     * <p>
     * // JPA 문법으로 사용
     * boolean findByEmailOrderByEmailAsc(String email);
     * <p>
     * // 쿼리 사용
     *
     * @Transactional(value = "transactionManager")
     * @Modifying
     * @Query(value = "UPDATE User SET update_time = NOW(), email = :email  WHERE user_id = :user_id", nativeQuery = true)
     * void endDispatch(@Param("email") String email, @Param("user_id") Integer user_id);
     */

    @Query(value = "SELECT a.* " +
            "FROM artwork a " +
            "JOIN wish_list w ON a.artwork_id = w.artwork_id " +
            "WHERE w.user_id = :user_id",
            nativeQuery = true)
    List<ArtworkEntity> getArtworkByUserId(@Param("user_id") Integer user_id);

//        List<ArtworkEntity> findAll(Sort sort);
    @Query(value = "SELECT a.* " +
            "FROM artwork a " +
            "ORDER BY a.artwork_id DESC",
            nativeQuery = true)
    List<ArtworkEntity> findAllByOrderByArtworkIdDesc();


    @Query(value = "SELECT a.* " +
            "FROM artwork a " +
            "WHERE a.user_id = :creator_id AND visible = TRUE ORDER BY artwork_id DESC ",
            nativeQuery = true)
    List<ArtworkEntity> findAllByCreatorId(@Param("creator_id") Integer creator_id);

}
