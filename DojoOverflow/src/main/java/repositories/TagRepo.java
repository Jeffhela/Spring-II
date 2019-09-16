package repositories;

import javax.swing.text.html.HTML.Tag;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepo extends CrudRepository <Tag, Long> {

}
