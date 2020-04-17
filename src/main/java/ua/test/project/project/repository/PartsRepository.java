package ua.test.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.test.project.project.domain.Parts;


public interface PartsRepository extends JpaRepository<Parts, Long> {
}
