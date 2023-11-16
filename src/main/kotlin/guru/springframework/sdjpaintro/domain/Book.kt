package guru.springframework.sdjpaintro.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.EqualsAndHashCode

@Entity
@EqualsAndHashCode(of = ["id"])
class Book(
    val title: String,
    val isbn: String,
    val publisher: String,
    val authorId: Long? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
}