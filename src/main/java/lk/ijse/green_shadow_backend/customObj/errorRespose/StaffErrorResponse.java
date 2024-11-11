package lk.ijse.green_shadow_backend.customObj.errorRespose;

import lk.ijse.green_shadow_backend.customObj.StaffResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffErrorResponse implements StaffResponse, Serializable {
    private int status;
    private String message;
}
