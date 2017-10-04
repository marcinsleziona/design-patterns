package pl.ms.designpatterns.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/*
 * Created by Marcin on 2017-10-04 10:11
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {
        LiquibaseAutoConfiguration.class,
        ThymeleafAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,
        DataSourceAutoConfiguration.class
})
public class ProxyApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProxyApplication.class, args);
    }

    @Autowired
    Environment environment;

    @Bean
    CommandLineRunner runner() {
        return strings -> {
            ImagePrinter imagePrinter = null;

            imagePrinter = new ProxyImagePrinter("Copo_de_nieve.png");
            imagePrinter.print(environment, System.out);
        };
    }
}
