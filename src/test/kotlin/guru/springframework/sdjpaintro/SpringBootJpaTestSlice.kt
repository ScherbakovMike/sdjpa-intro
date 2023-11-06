package guru.springframework.sdjpaintro

import guru.springframework.sdjpaintro.domain.Book
import guru.springframework.sdjpaintro.repositories.BookRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.context.annotation.ComponentScan

@DataJpaTest
@ComponentScan(basePackages = ["guru.springframework.sdjpaintro.bootstrap"])
class SpringBootJpaTestSlice {

    @Autowired
    private lateinit var bookRepository: BookRepository

    @Test
    fun testJpaTestSlice() {
        val countBefore = bookRepository.count()
        bookRepository.save(Book("My Book", "1235555", "Self"))
        val countAfter = bookRepository.count()
        assertThat(countBefore).isLessThan(countAfter)
    }
}
