package sp.spring.io.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sp.spring.io.inventory.entity.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
}
