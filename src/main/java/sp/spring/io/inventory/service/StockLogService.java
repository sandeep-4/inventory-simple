package sp.spring.io.inventory.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.spring.io.inventory.entity.StockLogEntity;
import sp.spring.io.inventory.repository.StockLogRepository;

@Transactional
@Service
public class StockLogService {
    @Autowired
    private StockLogRepository stockLogRepository;

    public void insert(StockLogEntity stockLog) {
        stockLogRepository.save(stockLog);
    }


    public Optional<StockLogEntity> findById(int id) {
        return stockLogRepository.findById(id);
    }

    public Iterable<StockLogEntity> findAll() {
        return stockLogRepository.findAll();
    }

    public void updateStockLog(StockLogEntity stockLog) {
        stockLogRepository.save(stockLog);
    }

    public void deleteStockLog(StockLogEntity stockLog) {
        stockLogRepository.delete(stockLog);
    }


}
