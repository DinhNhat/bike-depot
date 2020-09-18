package nhatdinh.bikespecialties.db.repo;

import nhatdinh.bikespecialties.db.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    //    List<Product> findByBrand_Name(@Param("name") String name);
    List<Product> findByCategory_Id(@Param("id") int id);

    Page<Product> findByBrand_Name(@Param("name") String name, Pageable pageable);

    List<Product> findByListPriceBetween(@Param("firstPrice") Double firstPrice, @Param("secondPrice") Double secondPrice);
}
