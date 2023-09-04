package com.example.springboot.repositories;


import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/***
 * @author Ian S. pereira
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
