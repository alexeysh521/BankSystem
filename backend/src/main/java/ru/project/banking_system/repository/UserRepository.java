package ru.project.banking_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.banking_system.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);

    boolean existsByLogin(String login);

    boolean existsByEmail(String email);

}
