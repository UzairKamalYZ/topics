package be.techfix.vault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String... args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        getVaultValues(context);
    }

    private static void getVaultValues(ConfigurableApplicationContext context) {
        Credentials credentials1 = context.getBeanFactory().getBean(Credentials.class);
        System.out.println(credentials1);
    }

}