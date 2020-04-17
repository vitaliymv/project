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
        return null;
    }

    @Override
    public Parts deleteById(Long id) {
        return null;
    }

    @Override
    public List<Parts> findAll() {
        return partsRepository.findAll();
    }
}