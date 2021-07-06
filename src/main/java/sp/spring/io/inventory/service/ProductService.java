package sp.spring.io.inventory.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.spring.io.inventory.entity.Product;
import sp.spring.io.inventory.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public void insert(Product product) {
		productRepository.save(product);
	}

	public Optional<Product> find(int id) {
		return productRepository.findById(id);
	}

	public Iterable<Product> findAll() {
		return productRepository.findAll();
	}

	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	public void deleteProduct(Product product) {
		productRepository.delete(product);
	}

}
