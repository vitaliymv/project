package ua.test.project.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.test.project.project.domain.Manufacturer;
import ua.test.project.project.domain.Model;
import ua.test.project.project.repository.ModelRepository;
import ua.test.project.project.services.ModelService;

import java.util.*;

@Service
@RequiredArgsConstructor
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelRepository modelRepository;

    @Override
    public Model create(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public Model update(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public void deleteById(Integer id) {
        modelRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public List<Model> findAll() {
        Manufacturer manufacturer = new Manufacturer();
        List<Model> result = new ArrayList<>();
        modelRepository.findAll().iterator().forEachRemaining(result :: add);
        manufacturer.setModels(result);
        return result;
    }

    @Override
    public Optional<Model> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Model> findByModelName(String parameter) {
        return null;
    }

}
