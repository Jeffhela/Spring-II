package repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Category;
import models.Product;

@Repository
public interface ProductRepo extends CrudRepository <Product, Long> {
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
