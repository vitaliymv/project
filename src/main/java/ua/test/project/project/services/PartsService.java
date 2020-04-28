package ua.test.project.project.services;




import ua.test.project.project.domain.Model;
import ua.test.project.project.domain.Parts;

import java.util.List;
import java.util.Optional;

public interface PartsService {

    Parts create(Parts parts);
    Parts update(Parts parts);
    void deleteById(Long id);
    List<Parts> findAll();
    List<Parts> findByModelId(Long modelId);
    Optional<Parts> findById(Long id);
   List<Parts> findByCategoryIdAndModelId(Long categoryId, Long modelId);

    List<Parts> findByCategoryId(Long categoryId);
}
