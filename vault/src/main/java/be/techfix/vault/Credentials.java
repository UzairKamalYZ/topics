package be.techfix.vault;


import lombok.Builder;
import lombok.ToString;
@Builder
@ToString
public class Credentials {
    private String user;
    private String password;
}
