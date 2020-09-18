package nhatdinh.bikespecialties;

import nhatdinh.bikespecialties.db.repo.BrandRepository;
import nhatdinh.bikespecialties.db.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BikeSpecialtiesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BikeSpecialtiesApplication.class, args);
	}

	@Autowired
	BrandRepository brandRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=========Search by last name=============");
		String lastName = "en";
		customerRepository.searchForLastNameLike(lastName).forEach(System.out::println);
	}
}
