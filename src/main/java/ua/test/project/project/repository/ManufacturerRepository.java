package ua.test.project.project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.test.project.project.domain.Manufacturer;

import java.util.List;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {

}
