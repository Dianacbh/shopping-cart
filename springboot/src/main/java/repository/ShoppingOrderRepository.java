package repository;

import entity.CartEntity;
import entity.ShoppingOrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingOrderRepository extends CrudRepository<ShoppingOrderEntity, Long> {

}
