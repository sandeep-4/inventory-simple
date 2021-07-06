package sp.spring.io.inventory.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sp.spring.io.inventory.entity.ProductPricing;
import sp.spring.io.inventory.service.ProductPricingService;

@RestController
@RequestMapping("/productpricing")
public class ProductPricingController {

    @Autowired
    private ProductPricingService productPricingService;

    @RequestMapping("")
    public Iterable<ProductPricing> getAllProductPricing() {
        return productPricingService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<ProductPricing> searchProductPricing(@PathVariable int id) {
        return productPricingService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addProductPricing(@RequestBody ProductPricing productPricing) {
        productPricingService.insert(productPricing);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateProductPricing(@RequestBody ProductPricing productPricing) {
        productPricingService.updateProductPricing(productPricing);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteProductPricing(@RequestBody ProductPricing productPricing) {
        productPricingService.deleteProductPricing(productPricing);
    }

}
