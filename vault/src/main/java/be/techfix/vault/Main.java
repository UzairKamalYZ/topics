package be.techfix.vault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.vault.support.VaultResponse;

import java.util.Map;

@SpringBootApplication
public class Main {

    public static void main(String... args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        getVaultValues(context);
    }

    private static void getVaultValues(ConfigurableApplicationContext context) {
        CredentialRetriever credentialRetriever = context.getBeanFactory().getBean(CredentialRetriever.class);
        VaultResponse credentials = credentialRetriever.getCredentials();
        Map<String, String> data = (Map<String, String>) credentials.getData().get("data");
        System.out.println(data.get("user"));
        System.out.println(data.get("password"));
    }

}