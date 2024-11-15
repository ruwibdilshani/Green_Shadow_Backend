package lk.ijse.green_shadow_backend.service;


import lk.ijse.green_shadow_backend.customObj.UserResponse;
import lk.ijse.green_shadow_backend.dto.impl.UserDTO;

public interface UserBo {
    void saveUser(UserDTO user);

    UserResponse getUserByEmail(String email);

    void updateUser(UserDTO user , String email);
}
