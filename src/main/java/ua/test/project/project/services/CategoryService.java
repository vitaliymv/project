package ua.test.project.project.services;



import ua.test.project.project.domain.Category;

import java.util.List;

public interface CategoryService {

    Category create(Category category);
    Category update(Category category);
    Category deleteById(Long id);
    List<Category> findAll();
}
