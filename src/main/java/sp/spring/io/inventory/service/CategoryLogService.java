package sp.spring.io.inventory.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.spring.io.inventory.entity.CategoryLogEntity;
import sp.spring.io.inventory.repository.CategoryLogRepository;

@Transactional
@Service
public class CategoryLogService {
    @Autowired
    private CategoryLogRepository categoryLogRepository;

    public void insert(CategoryLogEntity categoryLog) {
        categoryLogRepository.save(categoryLog);
    }


    public Optional<CategoryLogEntity> findById(int id) {
        return categoryLogRepository.findById(id);
    }

    public Iterable<CategoryLogEntity> findAll() {
        return categoryLogRepository.findAll();
    }

    public void updateCategoryLog(CategoryLogEntity categoryLog) {
        categoryLogRepository.save(categoryLog);
    }

    public void deleteCategoryLog(CategoryLogEntity categoryLog) {
        categoryLogRepository.delete(categoryLog);
    }




}
