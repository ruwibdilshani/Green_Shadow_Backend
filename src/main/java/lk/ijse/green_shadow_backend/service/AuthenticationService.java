package lk.ijse.green_shadow_backend.service;

import lk.ijse.green_shadow_backend.dto.impl.UserDTO;
import lk.ijse.green_shadow_backend.jwtmodels.JwtAuthResponse;
import lk.ijse.green_shadow_backend.jwtmodels.SignIn;

public interface AuthenticationService {
    JwtAuthResponse signIn(SignIn signIn);
    JwtAuthResponse signUp(UserDTO signUp);
    JwtAuthResponse refreshToken(String accessToken);
}
