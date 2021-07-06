package sp.spring.io.inventory.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.spring.io.inventory.entity.PricingLogEntity;
import sp.spring.io.inventory.repository.PricingLogRepository;

@Transactional
@Service
public class PricingLogService {

    @Autowired
    private PricingLogRepository pricingLogRepository;

    public void insert(PricingLogEntity pricingLog) {
        pricingLogRepository.save(pricingLog);
    }


    public Optional<PricingLogEntity> findById(int id) {
        return pricingLogRepository.findById(id);
    }

    public Iterable<PricingLogEntity> findAll() {
        return pricingLogRepository.findAll();
    }

    public void updatePricingLog(PricingLogEntity pricingLog) {
        pricingLogRepository.save(pricingLog);
    }

    public void deletePricingLog(PricingLogEntity pricingLog) {
        pricingLogRepository.delete(pricingLog);
    }


}
