package lk.ijse.persistence_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dewmith Mihisara
 * @date 2024-07-03
 * @since 0.0.1
 */
@Repository
public interface VehicleRepository extends JpaRepository<VehicleRepository, Long> {
}
