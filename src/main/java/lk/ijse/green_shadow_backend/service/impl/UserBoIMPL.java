package lk.ijse.green_shadow_backend.service.impl;


import lk.ijse.green_shadow_backend.Repository.UserRepository;
import lk.ijse.green_shadow_backend.customObj.UserResponse;
import lk.ijse.green_shadow_backend.customObj.errorRespose.UserErrorResponse;
import lk.ijse.green_shadow_backend.dto.impl.UserDTO;
import lk.ijse.green_shadow_backend.entity.User;
import lk.ijse.green_shadow_backend.exception.DataPersistFailedException;
import lk.ijse.green_shadow_backend.exception.NotFoundException;
import lk.ijse.green_shadow_backend.service.UserBo;
import lk.ijse.green_shadow_backend.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserBoIMPL implements UserBo {

    private final UserRepository userRepository;

    private final Mapping mapping;

    @Override
    public void saveUser(UserDTO user) {
        Optional<User> existsUser = userRepository.findByEmail(user.getEmail());
        if (!existsUser.isPresent()) {
            User save = userRepository.save(mapping.convertUserDTOToUser(user));
            if (save == null) {
                throw new DataPersistFailedException("User save failed");
            }
        }else {
            throw new DataPersistFailedException("User already exists");
        }
    }

    @Override
    public UserResponse getUserByEmail(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent()) {
            return mapping.convertUserToUserDTO(user.get());
        }else {
            return new UserErrorResponse(0,"User not found");
        }
    }

    @Override
    public void updateUser(UserDTO user, String email) {
        Optional<User> existsUser = userRepository.findByEmail(email);
        if (existsUser.isPresent()) {
            existsUser.get().setPassword(user.getPassword());
        }else {
            throw new NotFoundException("User not exists");
        }
    }

}
