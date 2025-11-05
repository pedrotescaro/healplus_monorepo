package com.healplus.backend.Controller.Auth;

import com.healplus.backend.Model.DTO.AuthRequest;
import com.healplus.backend.Model.DTO.AuthResponse;
import com.healplus.backend.Model.DTO.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        // Implementar lógica de login
        AuthResponse response = new AuthResponse();
        response.setToken("sample-jwt-token");
        response.setMessage("Login realizado com sucesso");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        // Implementar lógica de registro
        AuthResponse response = new AuthResponse();
        response.setToken("sample-jwt-token");
        response.setMessage("Registro realizado com sucesso");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
        return ResponseEntity.ok("Logout realizado com sucesso");
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<String> forgotPassword(@RequestBody ForgotPasswordRequest request) {
        // Implementar lógica de recuperação de senha
        return ResponseEntity.ok("Email de recuperação enviado");
    }

    @PostMapping("/reset-password")
    public ResponseEntity<String> resetPassword(@RequestBody ResetPasswordRequest request) {
        // Implementar lógica de redefinição de senha
        return ResponseEntity.ok("Senha redefinida com sucesso");
    }

    public static class ForgotPasswordRequest {
        private String email;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public static class ResetPasswordRequest {
        private String token;
        private String newPassword;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getNewPassword() {
            return newPassword;
        }

        public void setNewPassword(String newPassword) {
            this.newPassword = newPassword;
        }
    }
}
