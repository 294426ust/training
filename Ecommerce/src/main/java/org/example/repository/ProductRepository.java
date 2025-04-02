package org.example.repository;

import org.example.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<product, Integer> {

    @Query("select x from product p where p.product_id= :id and p.quantity >= :q")
    Optional<product> checkProductStock(@Param("id") int id, @Param("q") int quantity);

}
