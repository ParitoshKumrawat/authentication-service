package com.paritosh.authentication_service.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private ROLE role;
    private boolean enabled;
    private boolean emailVerified;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
