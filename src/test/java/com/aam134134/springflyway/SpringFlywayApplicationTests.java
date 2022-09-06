package com.aam134134.springflyway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Uses special TestContainers JDBC URL to init Postgres. See application-test.yml
 */
@ActiveProfiles("test") // application-test.yml
@SpringBootTest
class SpringFlywayApplicationTests {

    @Test
    void contextLoads() {
    }

}
