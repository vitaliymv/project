package ua.test.project.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.test.project.project.domain.Parts;
import ua.test.project.project.repository.PartsRepository;
import ua.test.project.project.services.PartsService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartsServiceImpl implements PartsService {

    @Autowired
    private PartsRepository partsRepository;

    @Override
    public Parts create(Parts parts) {
        return partsRepository.save(parts);
    }

    @Override
    public Parts update(Parts parts) {
        return partsRepository.save(parts);
    }

    @Override
    public void deleteById(Long id) {
        partsRepository.deleteById(id);
    }

    @Override
    public List<Parts> findAll() {
        return partsRepository.findAll();
    }

    @Override
    public List<Parts> findByModelId(Long modelId) {
        return partsRepository.findByModelId(modelId);
    }

    @Override
    public List<Parts> findByCategoryIdAndModelId(Long categoryId, Long modelId) {
        return partsRepository.findByCategoryIdAndModelId(categoryId, modelId);
    }

    @Override
    public List<Parts> findByCategoryId(Long categoryId) {
        return partsRepository.findByCategoryId(categoryId);
    }


}