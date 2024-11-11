package lk.ijse.green_shadow_backend.customObj.errorRespose;

import lk.ijse.green_shadow_backend.customObj.EquipmentResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EquipmentErrorResponse implements EquipmentResponse, Serializable {
    private String message;
    private int errorCode;
}
