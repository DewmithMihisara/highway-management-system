package lk.ijse.persistence_service.repository;

import lk.ijse.persistence_service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Dewmith Mihisara
 * @date 2024-07-03
 * @since 0.0.1
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    boolean existsByEmail(String email);

    Optional<UserEntity> findByEmail(String email);
}
