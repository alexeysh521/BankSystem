package ru.project.banking_system.enumType;

import jakarta.persistence.EntityNotFoundException;

public enum RolesType {

    USER, ADMIN;

    public static RolesType getRoleFromString(String role){
        try {
            return RolesType.valueOf(role.trim().toUpperCase());
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Неверный ввод.");
        }

    }
}
