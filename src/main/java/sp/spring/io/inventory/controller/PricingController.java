package sp.spring.io.inventory.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sp.spring.io.inventory.entity.Pricing;
import sp.spring.io.inventory.entity.TheLogConverter;
import sp.spring.io.inventory.service.PricingLogService;
import sp.spring.io.inventory.service.PricingService;

@RestController
@RequestMapping("/categories/{id}/products/{id}/pricings")
public class PricingController {

	@Autowired
	public PricingService pricingService;
	@Autowired
	private PricingLogService pricingLogService;

	@RequestMapping("")
	public Iterable<Pricing> getAllPricing() {
		return pricingService.findAll();
	}

	@RequestMapping("/{id}")
	public Optional<Pricing> searchPricing(@PathVariable int id) {
		return pricingService.find(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "")
	public void addPricing(@RequestBody Pricing pricing) {
		pricingService.insert(pricing);
		pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateCategory(@RequestBody Pricing pricing) {
		pricingService.updatePricing(pricing);
		pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deletePricing(@RequestBody Pricing pricing) {
		pricingService.delete(pricing);
		pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
	}

}
