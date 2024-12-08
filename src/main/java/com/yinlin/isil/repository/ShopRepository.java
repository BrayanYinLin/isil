package com.yinlin.isil.repository;

import com.yinlin.isil.entity.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRepository extends JpaRepository<ShopEntity, Integer> {
    List<ShopEntity> findByDistritContains(String distrit);
}
