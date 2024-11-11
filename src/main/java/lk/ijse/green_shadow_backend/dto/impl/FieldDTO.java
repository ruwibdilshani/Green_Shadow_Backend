package lk.ijse.green_shadow_backend.dto.impl;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

import lk.ijse.green_shadow_backend.customObj.FieldResponse;
import lk.ijse.green_shadow_backend.dto.SuperDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldDTO implements FieldResponse, SuperDto {

    private String fieldCode;

    @NotBlank
    @Pattern(regexp = "^[A-Za-z0-9 ]+$")
    private String fieldName;

    @NotBlank
    private Point fieldLocation;

    @Positive
    @NotNull // Changed to @NotNull to avoid conflicts
    private double fieldSize;

    @NotNull
    private String image1;

    @NotNull
    private String image2;

    @NotNull
    private List<String> staffId;
}
