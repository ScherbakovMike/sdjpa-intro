package guru.springframework.sdjpaintro.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.EqualsAndHashCode

@Entity
@EqualsAndHashCode(of = ["id"])
class Author(val firstName: String, val lastName: String) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
}