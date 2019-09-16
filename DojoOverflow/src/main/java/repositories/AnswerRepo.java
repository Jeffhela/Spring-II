package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Answer;

@Repository

public interface AnswerRepo extends CrudRepository <Answer, Long> {

}
