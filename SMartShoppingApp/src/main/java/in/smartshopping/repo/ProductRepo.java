package in.smartshopping.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.smartshopping.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    Optional<Product> findByProductName(String productName);

    List<Product> findAll();
    
    Optional<Product> findByProductId(Long id);

    
}