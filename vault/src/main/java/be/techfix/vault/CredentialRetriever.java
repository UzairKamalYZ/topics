package be.techfix.vault;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponse;

import java.util.Map;

@Configuration
public class CredentialRetriever {
    final VaultTemplate vaultTemplate;

    public CredentialRetriever(VaultTemplate vaultTemplate) {
        this.vaultTemplate = vaultTemplate;
    }

    @Bean
    public Credentials getCredentials(){
        VaultResponse response = vaultTemplate.read("secret/data/be.techfix.example.vault-demo");
        Map<String, String> data = (Map<String, String>) response.getData().get("data");
        return Credentials.builder()
                .user(data.get("user"))
                .password(data.get("password"))
                .build();
    }

}
