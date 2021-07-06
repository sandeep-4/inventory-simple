package sp.spring.io.inventory.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.spring.io.inventory.entity.Pricing;
import sp.spring.io.inventory.repository.PricingRepository;

@Transactional
@Service
public class PricingService {

	@Autowired
	private PricingRepository pricingRepository;

	public void insert(Pricing pricing) {
		pricingRepository.save(pricing);
	}

	public Iterable<Pricing> getAllStock() {
		return pricingRepository.findAll();
	}

	public Iterable<Pricing> findAll() {
		return pricingRepository.findAll();
	}

	public Optional<Pricing> find(int id) {
		return pricingRepository.findById(id);
	}

	public void updatePricing(Pricing pricing) {
		pricingRepository.save(pricing);
	}

	public void delete(Pricing pricing) {
		pricingRepository.delete(pricing);
	}

}
