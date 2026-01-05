package org.example.billingservice.repositories;

import org.example.billingservice.DTO.Product;
import org.example.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}
