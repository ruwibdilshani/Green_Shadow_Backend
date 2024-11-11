package lk.ijse.green_shadow_backend.dto.impl;


import lk.ijse.green_shadow_backend.customObj.CropResponse;
import lk.ijse.green_shadow_backend.dto.SuperDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CropDTO implements CropResponse, SuperDto {
    private String cropCode;
    private String cropCommonName;
    private String cropScientificName;
    private String cropImage;
    private String category;
    private String cropSeason;
    private String fieldCode;
}
