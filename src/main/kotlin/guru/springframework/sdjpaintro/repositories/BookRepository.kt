package guru.springframework.sdjpaintro.repositories

import guru.springframework.sdjpaintro.domain.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository: JpaRepository<Book, Long> {
}