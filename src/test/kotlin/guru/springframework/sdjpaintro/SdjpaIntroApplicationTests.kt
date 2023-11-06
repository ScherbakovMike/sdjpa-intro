package guru.springframework.sdjpaintro

import guru.springframework.sdjpaintro.repositories.BookRepository
import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SdjpaIntroApplicationTests {

	@Autowired
	private lateinit var bookRepository: BookRepository

	@Test
	fun testBookRepository() {
		assertThat(bookRepository.count()).isGreaterThan(0)
	}

	@Test
	fun contextLoads() {
	}

}
