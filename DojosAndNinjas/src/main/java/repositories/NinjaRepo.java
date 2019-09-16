package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {

}