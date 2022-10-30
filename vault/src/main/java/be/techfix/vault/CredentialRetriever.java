package be.techfix.vault;

import org.springframework.stereotype.Service;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponse;

@Service
public class CredentialRetriever {
    final VaultTemplate vaultTemplate;

    public CredentialRetriever(VaultTemplate vaultTemplate) {
        this.vaultTemplate = vaultTemplate;
    }

    public VaultResponse getCredentials() {
        return vaultTemplate.read("secret/data/be.techfix.example.vault-demo");
    }
}
