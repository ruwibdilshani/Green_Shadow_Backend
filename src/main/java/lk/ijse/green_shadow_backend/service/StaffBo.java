package lk.ijse.green_shadow_backend.service;

import jakarta.validation.Valid;
import lk.ijse.green_shadow_backend.customObj.StaffResponse;
import lk.ijse.green_shadow_backend.dto.impl.StaffDTO;


import java.util.List;

public interface StaffBo {
    void saveStaff(StaffDTO staffDTO);

    StaffResponse getStaff(String id);

    void updateStaff(@Valid StaffDTO staffDTO,String id);

    void deleteStaff(String id);

    List<StaffDTO> getAllStaff();
}
