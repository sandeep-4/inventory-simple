package sp.spring.io.inventory.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.spring.io.inventory.entity.ProductPricing;
import sp.spring.io.inventory.repository.ProductPricingRepository;

@Transactional
@Service
public class ProductPricingService {

@Autowired
    private ProductPricingRepository productPricingRepository;


    public void insert( ProductPricing productPricing) {
        productPricingRepository.save(productPricing);
    }


    public Optional< ProductPricing> findById(int id) {
        return productPricingRepository.findById(id);
    }

    public Iterable<ProductPricing> findAll() {
        return productPricingRepository.findAll();
    }

    public void updateProductPricing( ProductPricing productPricing) {
        productPricingRepository.save(productPricing);
    }

    public void deleteProductPricing( ProductPricing productPricing) {
        productPricingRepository.delete(productPricing);
    }


}
