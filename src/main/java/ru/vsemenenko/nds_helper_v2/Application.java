package ru.vsemenenko.nds_helper_v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.vsemenenko.nds_helper_v2.config.CompanyInfoConfig;

@SpringBootApplication
@EnableConfigurationProperties({CompanyInfoConfig.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
