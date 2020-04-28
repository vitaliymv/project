package ua.test.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.test.project.project.domain.Bucket;

import java.util.Optional;

public interface BucketRepository extends JpaRepository<Bucket, Long> {

    Optional<Bucket> findByUserId(Long id);
}
