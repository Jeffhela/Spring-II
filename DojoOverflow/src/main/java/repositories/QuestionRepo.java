package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Question;

@Repository
public interface QuestionRepo extends CrudRepository <Question, Long> {

}
