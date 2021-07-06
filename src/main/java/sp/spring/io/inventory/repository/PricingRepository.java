package sp.spring.io.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sp.spring.io.inventory.entity.Pricing;


@Repository
public interface PricingRepository extends CrudRepository<Pricing, Integer> {


}
