package solid.springframework.sdjpa_intro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import solid.springframework.sdjpa_intro.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
