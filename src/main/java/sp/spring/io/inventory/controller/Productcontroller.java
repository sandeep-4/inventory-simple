package sp.spring.io.inventory.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sp.spring.io.inventory.entity.Product;
import sp.spring.io.inventory.entity.TheLogConverter;
import sp.spring.io.inventory.service.ProductLogService;
import sp.spring.io.inventory.service.ProductService;

@RestController
@RequestMapping("categories/{id}/products")
public class Productcontroller {

	@Autowired
	ProductService productService;

	@Autowired
	ProductLogService productLogService;

	@RequestMapping("")
	public Iterable<Product> findAll() {
		return productService.findAll();
	}

	@RequestMapping("/{id}")
	public Optional<Product> serachProduct(@PathVariable(name = "id") int id) {
		return productService.find(id);
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void addProduct(@RequestBody Product product) {
		productService.insert(product);
		productLogService.insert(TheLogConverter.productLogConverter(product));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
		productLogService.insert(TheLogConverter.productLogConverter(product));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@RequestBody Product product) {
		productService.deleteProduct (product);
		productLogService.insert(TheLogConverter.productLogConverter(product));
	}

}
