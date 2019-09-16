package repositories;

import org.springframework.data.repository.CrudRepository;

import models.CategoryProduct;

public interface CategoryProductRepo extends CrudRepository <CategoryProduct, Long>{

}
