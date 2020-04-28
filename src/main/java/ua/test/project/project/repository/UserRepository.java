package ua.test.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.test.project.project.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

}
