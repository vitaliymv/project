package ua.test.project.project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.test.project.project.domain.Manufacturer;
import ua.test.project.project.domain.Model;
import ua.test.project.project.repository.ManufacturerRepository;
import ua.test.project.project.repository.ModelRepository;
import ua.test.project.project.services.ManufacturerService;

import java.util.*;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @Autowired
    private ModelRepository modelRepository;



    @Override
    public Manufacturer create(Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    @Override
    public Manufacturer update(Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    @Override
    public void deleteById(Integer id) {
        manufacturerRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }

    @Override
    public Optional<Manufacturer> findById(Integer id) {
        return Optional.empty();
    }



}
