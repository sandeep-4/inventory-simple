package sp.spring.io.inventory.service;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.spring.io.inventory.entity.Category;
import sp.spring.io.inventory.repository.CategoryRepository;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */


@Transactional
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void insert(Category category) {
        categoryRepository.save(category);
    }


    public Optional<Category> findById(int id) {
        return categoryRepository.findById(id);
    }

    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    public void updateCategory(Category category) {

        categoryRepository.save(category);
    }

    public void deleteCategory(Category category) {

        categoryRepository.delete(category);
    }


}
