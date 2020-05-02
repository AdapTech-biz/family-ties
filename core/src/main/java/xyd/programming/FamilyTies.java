package xyd.programming;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class FamilyTies {

    public static void main(String[] args) {
        SpringApplication.run(FamilyTies.class, args);

        log.info("Family Ties Application");
    }
}
