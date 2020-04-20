package ua.test.project.project.services;




import ua.test.project.project.domain.Model;
import ua.test.project.project.domain.Parts;

import java.util.List;

public interface PartsService {

    Parts create(Parts parts);
    Parts update(Parts parts);
    Parts deleteById(Long id);
    List<Parts> findAll();
    List<Parts> findByModelId(Long modelId);


   List<Parts> findByCategoryIdAndModelId(Long categoryId, Long modelId);

    List<Parts> findByCategoryId(Long categoryId);
}
