package lk.ijse.green_shadow_backend.Repository;

import lk.ijse.green_shadow_backend.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

    boolean existsByVehicleCode(String vehicleCode);

    boolean existsByLicensePlateNumber(String licensePlateNumber);

}
