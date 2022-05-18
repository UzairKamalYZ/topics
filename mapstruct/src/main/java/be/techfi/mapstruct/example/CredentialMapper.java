package be.techfi.mapstruct.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CredentialMapper {
    CredentialMapper INSTANCE = Mappers.getMapper(CredentialMapper.class);

    @Mapping(source = "username", target = "user")
    @Mapping(source = "password", target = "key")
    CredentialDto getDto(Credentials credentials);
}
