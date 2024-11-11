package lk.ijse.green_shadow_backend.customObj.errorRespose;


import lk.ijse.green_shadow_backend.customObj.FieldResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FieldErrorResponse implements FieldResponse, Serializable {
    private String message;
    private int errorCode;
}
