package sp.spring.io.inventory.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sp.spring.io.inventory.entity.Category;


@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {


}
