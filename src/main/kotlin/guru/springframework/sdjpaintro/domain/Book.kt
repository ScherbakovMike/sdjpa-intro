package guru.springframework.sdjpaintro.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import lombok.EqualsAndHashCode

@Entity
@EqualsAndHashCode(of = ["id"])
class Book {
    @Id
    @GeneratedValue
    var id: Long = 0

    var title: String = ""
    var isbn: String = ""
    var publisher: String = ""
}