package nhatdinh.bikespecialties.db.repo;

import nhatdinh.bikespecialties.db.domain.OrderItem;
import nhatdinh.bikespecialties.db.domain.OrderItemPk;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderItemRepository extends CrudRepository<OrderItem, OrderItemPk> {
    List<OrderItem> findByOrder_Id(Integer id);
}
