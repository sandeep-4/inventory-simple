package sp.spring.io.inventory.service;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.spring.io.inventory.entity.Invoice;
import sp.spring.io.inventory.repository.InvoiceRepository;

@Transactional
@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public void insert(Invoice invoice) {
        invoiceRepository.save(invoice);
    }


    public Optional<Invoice> findById(int id) {
        return invoiceRepository.findById(id);
    }

    public Iterable<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    public void updateInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public void deleteInvoice(Invoice invoice) {
        invoiceRepository.delete(invoice);
    }



}
