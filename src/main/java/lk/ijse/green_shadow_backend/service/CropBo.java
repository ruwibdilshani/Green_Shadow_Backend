package lk.ijse.green_shadow_backend.service;



import lk.ijse.green_shadow_backend.customObj.CropResponse;
import lk.ijse.green_shadow_backend.dto.impl.CropDTO;

import java.util.List;

public interface CropBo {
    void saveCrop(CropDTO cropDTO, String fieldCode);

    CropResponse getCrop(String id);

    void updateCrop(CropDTO cropDTO, String fieldCode, String id);

    void deleteCrop(String id);

    List getAllCrops();
}
