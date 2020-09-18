package nhatdinh.bikespecialties.db.repo;

import nhatdinh.bikespecialties.db.domain.Stock;
import nhatdinh.bikespecialties.db.domain.StockPk;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock, StockPk> {
}
