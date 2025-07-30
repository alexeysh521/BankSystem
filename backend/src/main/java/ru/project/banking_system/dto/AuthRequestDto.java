package ru.project.banking_system.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthRequestDto {

    @NotNull(message = "Поле не может быть пустым.")
    @Size(min = 4, max = 24, message = "Введите логин не меньше 4-х и не более 24-х символов.")
    private String login;

    @NotNull(message = "Поле не может быть пустым.")
    @Size(min = 6, max = 100, message = "Введите пароль не меньше 6-ти и не более 100-а символов.")
    private String password;

}
