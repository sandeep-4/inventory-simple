package sp.spring.io.inventory.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.spring.io.inventory.entity.Supplier;
import sp.spring.io.inventory.repository.SupplierRepository;

@Transactional
@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public void insert(Supplier supplier) {
        supplierRepository.save(supplier);
    }


    public Optional<Supplier> findById(int id) {
        return supplierRepository.findById(id);
    }

    public Iterable<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    public void updateSupplier(Supplier supplier) {

        supplierRepository.save(supplier);
    }

    public void deleteSupplier(Supplier supplier) {

        supplierRepository.delete(supplier);
    }
}
