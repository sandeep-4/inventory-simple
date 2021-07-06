package sp.spring.io.inventory.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sp.spring.io.inventory.entity.Category;
import sp.spring.io.inventory.entity.TheLogConverter;
import sp.spring.io.inventory.service.CategoryLogService;
import sp.spring.io.inventory.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;
    @Autowired
    private CategoryLogService categoryLogService;

    @RequestMapping("")
    public Iterable<Category> getAllCategory() {
        return categoryService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Category> searchCategory(@PathVariable int id) {
        return categoryService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addCategory(@RequestBody Category category) {
        categoryService.insert(category);
        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteCategory(@RequestBody Category category) {
        categoryService.deleteCategory(category);
        categoryLogService.insert(TheLogConverter.categoryLogConverter(category));
    }


}
