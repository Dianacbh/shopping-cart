package repository;

import entity.UserEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository <UserEntity, Long> {

    UserEntity findOneByUserName(String userName);
}
