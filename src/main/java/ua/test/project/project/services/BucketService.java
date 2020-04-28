package ua.test.project.project.services;

import ua.test.project.project.domain.Bucket;
import ua.test.project.project.domain.Model;

import java.util.List;
import java.util.Optional;

public interface BucketService {

    Bucket create(Bucket bucket);

    Bucket update(Bucket bucket);

    void deleteById(Integer id);

    List<Bucket> findAll();

    Optional<Bucket> findByUserId(Long id);

}
