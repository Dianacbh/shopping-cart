package repository;

import entity.CategoryEntity;
import entity.UserEntity;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface CategoryRepository extends Repository <CategoryEntity, Long> {

    List<CategoryEntity> findByParentCategory(CategoryEntity parentCategory);


    CategoryEntity findOneByName(String userName);
}
