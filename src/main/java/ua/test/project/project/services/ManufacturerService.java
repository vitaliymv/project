package ua.test.project.project.services;



import ua.test.project.project.domain.Manufacturer;
import ua.test.project.project.domain.Model;

import java.util.List;
import java.util.Optional;

public interface ManufacturerService {

    Manufacturer create(Manufacturer manufacturer);

    Manufacturer update(Manufacturer manufacturer);

    void deleteById(Integer id);

    List<Manufacturer> findAll();

    Optional<Manufacturer> findById(Integer id);

}
