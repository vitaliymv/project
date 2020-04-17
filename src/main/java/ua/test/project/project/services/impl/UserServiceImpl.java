package ua.test.project.project.services.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.test.project.project.domain.User;
import ua.test.project.project.repository.UserRepository;
import ua.test.project.project.services.UserService;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void registerNewUser(User user) {

    }

    @Override
    public void confirmRegistration(String token) {

    }
}
