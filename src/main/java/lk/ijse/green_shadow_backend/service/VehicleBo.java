package lk.ijse.green_shadow_backend.service;



import lk.ijse.green_shadow_backend.customObj.VehicleResponse;
import lk.ijse.green_shadow_backend.dto.impl.VehicleDTO;

import java.util.List;

public interface VehicleBo {
    void saveVehicle(VehicleDTO vehicleDTO);

    void updateVehicle(VehicleDTO vehicleDTO , String staffId , String vehicleCode);

    VehicleResponse getVehicle(String vehicleCode);

    void deleteVehicle(String vehicleCode);

    List getAllVehicles();
}
