package guru.springframework.sdjpaintro.config

import org.flywaydb.core.Flyway
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Profile("clean")
@Configuration
class DBClean {

    @Bean
    fun clean(): FlywayMigrationStrategy {
        return FlywayMigrationStrategy { flyway: Flyway ->
            flyway.clean()
            flyway.migrate()
        }
    }
}