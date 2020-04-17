package ua.test.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.test.project.project.domain.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
