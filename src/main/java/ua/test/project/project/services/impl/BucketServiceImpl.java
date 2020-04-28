package ua.test.project.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.test.project.project.domain.Bucket;
import ua.test.project.project.repository.BucketRepository;
import ua.test.project.project.services.BucketService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BucketServiceImpl implements BucketService {

    @Autowired
    private BucketRepository bucketRepository;

    @Override
    public Bucket create(Bucket bucket) {
        return bucketRepository.save(bucket);
    }

    @Override
    public Bucket update(Bucket bucket) {
        return bucketRepository.save(bucket);
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<Bucket> findAll() {
        return bucketRepository.findAll();
    }

    @Override
    public Optional<Bucket> findByUserId(Long id) {
        return bucketRepository.findByUserId(id);
    }
}
