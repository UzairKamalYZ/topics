package be.techfi.mapstruct.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CredentialMapperTest {

    private static final String USER_NAME = "::: User Name :::";
    private static final String PASSWORD = "::: Password :::";

    @Test
    @DisplayName("Credential should be mapped correctly to CredentialDto ")
    void should_map_correctly() {
        CredentialMapper credentialMapper = CredentialMapper.INSTANCE;
        Credentials credentials = new Credentials();
        credentials.username(USER_NAME);
        credentials.password(PASSWORD);
        CredentialDto credentialDto = credentialMapper.getDto(credentials);
        assertThat(credentialDto).extracting(CredentialDto::getUser).isEqualTo(USER_NAME);
        assertThat(credentialDto).extracting(CredentialDto::getKey).isEqualTo(PASSWORD);


    }
}