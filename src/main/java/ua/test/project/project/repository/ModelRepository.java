package ua.test.project.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.test.project.project.domain.Model;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Long> {


}
