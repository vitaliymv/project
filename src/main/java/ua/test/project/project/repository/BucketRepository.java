package ua.test.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.test.project.project.domain.Bucket;

public interface BucketRepository extends JpaRepository<Bucket, Long> {
}
