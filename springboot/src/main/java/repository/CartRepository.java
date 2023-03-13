package repository;

import entity.CartEntity;
import entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface CartRepository extends CrudRepository<CartEntity, Long> {

}
