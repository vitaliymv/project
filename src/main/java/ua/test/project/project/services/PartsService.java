package ua.test.project.project.services;




import ua.test.project.project.domain.Parts;

import java.util.List;

public interface PartsService {

    Parts create(Parts parts);
    Parts update(Parts parts);
    Parts deleteById(Long id);
    List<Parts> findAll();
}
