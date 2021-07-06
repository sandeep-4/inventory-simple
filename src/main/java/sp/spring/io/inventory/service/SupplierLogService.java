package sp.spring.io.inventory.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.spring.io.inventory.entity.SupplierLogEntity;
import sp.spring.io.inventory.repository.SupplierLogRepository;

@Transactional
@Service
public class SupplierLogService {

    @Autowired
    private SupplierLogRepository supplierLogRepository;

    public void insert(SupplierLogEntity supplierLog) {
        supplierLogRepository.save(supplierLog);
    }


    public Optional<SupplierLogEntity> findById(int id) {
        return supplierLogRepository.findById(id);
    }

    public Iterable<SupplierLogEntity> findAll() {
        return supplierLogRepository.findAll();
    }

    public void updateSupplierLog(SupplierLogEntity supplierLog) {
        supplierLogRepository.save(supplierLog);
    }

    public void deleteSupplierLog(SupplierLogEntity supplierLog) {
        supplierLogRepository.delete(supplierLog);
    }



}
