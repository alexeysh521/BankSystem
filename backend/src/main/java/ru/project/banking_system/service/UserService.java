package ru.project.banking_system.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.project.banking_system.dto.RegisterRequestDto;
import ru.project.banking_system.model.User;
import ru.project.banking_system.repository.UserRepository;

@Service
@Transactional(readOnly = true)
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public boolean existsByLogin(String login){
        return userRepository.existsByLogin(login);
    }

    public boolean existsByEmail(String email){
        return userRepository.existsByEmail(email);
    }

    @Transactional
    public void save(User user){
        userRepository.save(user);
    }

    @Transactional
    public void forRegister(RegisterRequestDto request, String password){
        User user = modelMapper.map(request, User.class);
        user.setPassword(password);
        save(user);
        log.info("User registered: {}", user.getLogin());
    }

}
