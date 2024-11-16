package lk.ijse.green_shadow_backend.service;


import lk.ijse.green_shadow_backend.customObj.FieldResponse;
import lk.ijse.green_shadow_backend.dto.impl.FieldDTO;

import java.util.List;

public interface FieldBo {
    void saveField(FieldDTO fieldDTO);

    void updateField(FieldDTO fieldDTO, List<String> staffIds);

    FieldResponse getField(String fieldCode);

    void deleteField(String fieldCode);

    List getAllFields();
}
