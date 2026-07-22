package com.paritosh.authentication_service.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    @NotBlank
    @Size(max=50)
    private String firstName;
    @NotBlank
    @Size(max=50)
    private String lastName;
    @NotBlank
    @Size(min=8, max=100)
    private String password;
    @Email
    @NotBlank
    private String email;
}
