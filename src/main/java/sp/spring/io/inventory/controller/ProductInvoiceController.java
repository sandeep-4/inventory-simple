package sp.spring.io.inventory.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sp.spring.io.inventory.entity.ProductInvoice;
import sp.spring.io.inventory.service.ProductInvoiceService;

@RestController
@RequestMapping("/productinvoice")
public class ProductInvoiceController {
    @Autowired
    private ProductInvoiceService productInvoiceService;

    @RequestMapping("")
    public Iterable<ProductInvoice> getAllProductInvoice() {
        return productInvoiceService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<ProductInvoice> searchProductInvoice(@PathVariable int id) {
        return productInvoiceService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addProductInvoice(@RequestBody ProductInvoice productInvoice) {
        productInvoiceService.insert(productInvoice);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateProductInvoice(@RequestBody ProductInvoice productInvoice) {
        productInvoiceService.updateProductInvoice(productInvoice);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteProductInvoice(@RequestBody ProductInvoice productInvoice) {
        productInvoiceService.deleteProductInvoice(productInvoice);
    }

}
