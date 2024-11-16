package lk.ijse.green_shadow_backend.service;



import lk.ijse.green_shadow_backend.customObj.EquipmentResponse;
import lk.ijse.green_shadow_backend.dto.impl.EquipmentDTO;

import java.util.List;

public interface EquipmentBo {
    void saveEquipment(EquipmentDTO equipmentDTO);

    EquipmentResponse getEquipmentById(String equipmentId);

    void updateEquipment(EquipmentDTO equipmentDTO , String staffId , String fieldCode , String equipmentId);

    void deleteEquipment(String equipmentId);

    List getAllEquipment();
}
