package com.waterme.wateringscheduler.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginFormDTO {

    @NotNull
    @NotBlank
    @Size(min = 3, max = 16, message = "Invalid username. Must be 3-16 characters long.")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 16, message = "Invalid password, must be between 5-16 characters long.")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
