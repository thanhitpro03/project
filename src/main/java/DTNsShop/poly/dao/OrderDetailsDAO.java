package DTNsShop.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import DTNsShop.poly.entity.OrderDetails;

public interface OrderDetailsDAO extends JpaRepository<OrderDetails, Long> {

	@Query("SELECT o FROM OrderDetails o WHERE o.order.id = ?1")
	List<OrderDetails> getAllOrder(Long id);

	@Query("SELECT sum(o.quantity * o.price) FROM OrderDetails o WHERE o.order.id = ?1")
	Double getAmount(Long id);

	@Query("SELECT sum(o.quantity * o.price) FROM OrderDetails o WHERE o.order.status = true")  // Changed 1 to true
	Double getTotal();
}
