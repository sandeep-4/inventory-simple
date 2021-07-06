package sp.spring.io.inventory.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.spring.io.inventory.entity.Stock;
import sp.spring.io.inventory.repository.StockRepository;

@Transactional
@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public void insert(Stock stock) {
        stockRepository.save(stock);
    }

    public Optional<Stock> findById(int id) {
        return stockRepository.findById(id);
    }

    public Iterable<Stock> findAll() {
        return stockRepository.findAll();
    }

    public void updateStock(Stock stock) {
        stockRepository.save(stock);
    }

    public void deleteStock(Stock stock) {
        stockRepository.delete(stock);
    }


}
