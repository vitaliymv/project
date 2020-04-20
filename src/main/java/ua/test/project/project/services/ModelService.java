package ua.test.project.project.services;

import ua.test.project.project.domain.Manufacturer;
import ua.test.project.project.domain.Model;

import java.util.List;
import java.util.Optional;

public interface ModelService {

    Model create(Model model);

    Model update(Model model);

    void deleteById(Integer id);

    List<Model> findAll();

    Optional<Model> findById(Integer id);

    List<Model> findByModelName(String parameter);

    List<Model> findByManufacturerId(Long manufacturerId);
}
