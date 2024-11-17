package lk.ijse.green_shadow_backend.service;



import lk.ijse.green_shadow_backend.customObj.CropDetailsResponse;
import lk.ijse.green_shadow_backend.dto.impl.CropDetailsDTO;

import java.util.List;

public interface CropDetailsBo {
    void saveCropDetails(CropDetailsDTO cropDetailsDTO);

    void updateCropDetails(CropDetailsDTO cropDetailsDTO , String logCode);

    CropDetailsResponse findCropDetailsByLogCode(String logCode);

    void deleteCropDetailsByLogCode(String logCode);

    List<CropDetailsDTO> getAllCropDetails();
}
