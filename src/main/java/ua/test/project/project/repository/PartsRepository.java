package ua.test.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.test.project.project.domain.Model;
import ua.test.project.project.domain.Parts;

import java.util.List;
import java.util.Optional;


public interface PartsRepository extends JpaRepository<Parts, Long> {
    List<Parts> findByModelId(Long id);
    List<Parts> findByCategoryIdAndModelId(Long categoryId, Long modelId);
    List<Parts> findByCategoryId(Long categoryId);
}
