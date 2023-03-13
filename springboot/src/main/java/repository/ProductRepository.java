package repository;

import entity.ProductEntity;
import entity.UserEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProductRepository extends Repository <ProductEntity, Long> {

    List<ProductEntity> findByCategory(ProductEntity parentCategory);
}
