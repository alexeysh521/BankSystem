package ru.project.banking_system.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import ru.project.banking_system.enumType.RolesType;

@Data
public class RegisterRequestDto {

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Поле не может быть пустым.")
    private RolesType role;

    @NotNull(message = "Поле не может быть пустым.")
    @Size(min = 2, max = 20, message = "Введите корректную фамилию.")
    private String firstName;

    @NotNull(message = "Поле не может быть пустым.")
    @Size(min = 2, max = 20, message = "Введите корректное имя.")
    private String averageName;

    @NotNull(message = "Поле не может быть пустым.")
    @Size(min = 2, max = 20, message = "Введите корректное отчество.")
    private String lastName;

    @NotNull(message = "Поле не может быть пустым.")
    @Size(min = 4, max = 24, message = "Логин должен состоять не менее чем из 4-х и не более 24-х символов.")
    private String login;

    @NotNull(message = "Поле не может быть пустым.")
    @Size(min = 6, max = 100, message = "Введите пароль не меньше 6-ти и не более 100-а символов.")
    private String password;

    @NotNull(message = "Поле не может быть пустым.")
    @Email(message = "Неверный формат email.")
    private String email;

}
