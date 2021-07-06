package sp.spring.io.inventory.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sp.spring.io.inventory.entity.Supplier;
import sp.spring.io.inventory.entity.TheLogConverter;
import sp.spring.io.inventory.service.SupplierLogService;
import sp.spring.io.inventory.service.SupplierService;

@RestController
public class Suppliercontroller {

	@Autowired
	private SupplierService supplierService;

	@Autowired
	SupplierLogService supplierLogService;

	@RequestMapping("")
	public Iterable<Supplier> findall() {
		return supplierService.findAll();
	}

	@RequestMapping("/{id}")
	public Optional<Supplier> searchSupplier(@PathVariable(name = "id") int id) {
		return supplierService.findById(id);
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void addService(@RequestBody Supplier supplier) {
		supplierService.insert(supplier);
		supplierLogService.insert(TheLogConverter.supplierLogConverter(supplier));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void updateService(@RequestBody Supplier supplier) {
		supplierService.updateSupplier(supplier);
		supplierLogService.insert(TheLogConverter.supplierLogConverter(supplier));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteService(@RequestBody Supplier supplier) {
		supplierService.deleteSupplier(supplier);
		supplierLogService.insert(TheLogConverter.supplierLogConverter(supplier));
	}

}
