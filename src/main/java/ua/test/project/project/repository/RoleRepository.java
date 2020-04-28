package ua.test.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.test.project.project.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {


}
