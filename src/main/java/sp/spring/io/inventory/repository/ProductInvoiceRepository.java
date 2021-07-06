package sp.spring.io.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sp.spring.io.inventory.entity.ProductInvoice;

@Repository
public interface ProductInvoiceRepository extends JpaRepository<ProductInvoice,Integer>{
}
