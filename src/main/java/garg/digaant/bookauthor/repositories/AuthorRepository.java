package garg.digaant.bookauthor.repositories;

import garg.digaant.bookauthor.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
