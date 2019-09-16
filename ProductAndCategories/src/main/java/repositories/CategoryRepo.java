package repositories;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Product;

@Repository
public interface CategoryRepo extends CrudRepository <Category, Long> {
	List<Category> findAll();
   // List <Category> // findByProductsNotContains(Product product);
}