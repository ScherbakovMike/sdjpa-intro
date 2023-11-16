package guru.springframework.sdjpaintro.bootstrap

import guru.springframework.sdjpaintro.domain.Book
import guru.springframework.sdjpaintro.repositories.BookRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component

@Profile(value = ["local", "default"])
@Component
class DataInitializer(private val bookRepository: BookRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        this.bookRepository.deleteAll()
        this.bookRepository.save(Book("Domain Driven Design", "123", "RandomHouse"))
        this.bookRepository.save(Book("Spring In Action", "234234", "O'Reilly"))
        bookRepository.findAll().forEach { book: Book ->
            println("Book Id: ${book.id}")
            println("Book Title: ${book.title}")
        }
    }
}