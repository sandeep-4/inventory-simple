package sp.spring.io.inventory.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sp.spring.io.inventory.entity.Invoice;
import sp.spring.io.inventory.service.InvoiceService;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping("")
    public Iterable<Invoice> getAllInvoice() {
        return invoiceService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Invoice> searchInvoice(@PathVariable int id) {
        return invoiceService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addInvoice(@RequestBody Invoice invoice) {
        invoiceService.insert(invoice);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateInvoice(@RequestBody Invoice invoice) {
        invoiceService.updateInvoice(invoice);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteInvoice(@RequestBody Invoice invoice) {
        invoiceService.deleteInvoice(invoice);
    }

}
