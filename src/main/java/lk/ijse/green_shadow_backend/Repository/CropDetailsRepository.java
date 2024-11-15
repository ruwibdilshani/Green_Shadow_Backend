package lk.ijse.green_shadow_backend.Repository;


import lk.ijse.green_shadow_backend.entity.CropDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CropDetailsRepository extends JpaRepository<CropDetails, String> {
    boolean existsByLogCode(String logCode);
    Optional<CropDetails> findCropDetailsByLogCode(String logCode);
}
