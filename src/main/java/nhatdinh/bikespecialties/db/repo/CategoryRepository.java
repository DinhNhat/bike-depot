package nhatdinh.bikespecialties.db.repo;

import nhatdinh.bikespecialties.db.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
