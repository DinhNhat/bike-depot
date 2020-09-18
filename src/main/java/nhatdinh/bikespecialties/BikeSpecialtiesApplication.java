package nhatdinh.bikespecialties;

import nhatdinh.bikespecialties.db.repo.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BikeSpecialtiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikeSpecialtiesApplication.class, args);
	}

//	@Autowired
//	BrandRepository brandRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("\n*************Original Brand*************");
//		brandRepository.findAll().forEach(System.out::println);
//	}
}
