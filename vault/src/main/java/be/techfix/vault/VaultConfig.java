package be.techfix.vault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;

import java.net.URI;

@Configuration
public class VaultConfig extends AbstractVaultConfiguration {

    @Value("${VAULT_TOKEN}")
    private String vaultToken;
    @Value("${VAULT_SERVER}")
    private String vaultServer;

    @Override
    public ClientAuthentication clientAuthentication() {
        return new TokenAuthentication(vaultToken);
    }

    @Override
    public VaultEndpoint vaultEndpoint() {
        VaultEndpoint vaultEndpoint = VaultEndpoint.from(URI.create(vaultServer));
        vaultEndpoint.setScheme("http");
        return vaultEndpoint;
    }


}