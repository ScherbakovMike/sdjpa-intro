package guru.springframework.sdjpaintro

import guru.springframework.sdjpaintro.repositories.BookRepository
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.context.annotation.ComponentScan
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("local")
@DataJpaTest
@ComponentScan(basePackages = ["guru.springframework.sdjpaintro.bootstrap"])
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MySQLIntegrationTest {

    @Autowired
    private lateinit var bookRepository: BookRepository

    @Test
    fun testJpaTestSlice() {
        val countBefore = bookRepository.count()
        Assertions.assertThat(countBefore).isEqualTo(2)
    }
}