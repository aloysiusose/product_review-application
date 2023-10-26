package dev.aloysius.demopostgresflyway.Repository;

import dev.aloysius.demopostgresflyway.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Products, Long> {

    Optional<Products> findByProductName(String name);
}
