package lk.ijse.green_shadow_backend.Repository;


import lk.ijse.green_shadow_backend.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CropRepository extends JpaRepository<Crop, Integer> {
    Optional<Crop> findByCropCode(String id);
}
