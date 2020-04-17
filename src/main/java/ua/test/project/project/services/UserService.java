package ua.test.project.project.services;


import ua.test.project.project.domain.User;

public interface UserService {

    User save(User user);

    void registerNewUser(User user);

    void confirmRegistration(String token);

}
