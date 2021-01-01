package garg.digaant.bookauthor.repositories;

import garg.digaant.bookauthor.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
