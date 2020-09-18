package nhatdinh.bikespecialties;

import nhatdinh.bikespecialties.db.repo.BrandRepository;
import nhatdinh.bikespecialties.db.repo.CustomerRepository;
import nhatdinh.bikespecialties.db.repo.OrderItemRepository;
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

	@Autowired
	OrderItemRepository orderItemRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=========Search orderitem by orderId=============");
		int orderId = 7;
		orderItemRepository.findByOrder_Id(orderId).forEach(System.out::println);

	}
}
