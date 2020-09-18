package nhatdinh.bikespecialties;

import nhatdinh.bikespecialties.db.repo.BrandRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.function.DoubleToIntFunction;

@RunWith(SpringRunner.class)
@SpringBootTest
class BikeSpecialtiesApplicationTests {

	@Autowired
	BrandRepository brandRepository;

	@Test
	void contextLoads() {
		System.out.println("\n*************Original Brand*************");
		brandRepository.findAll().forEach(System.out::println);

		System.out.println("\n*************Numbers of Brand*************");
		long numberOfBrand = brandRepository.count();
		System.out.println(numberOfBrand);
	}
}
