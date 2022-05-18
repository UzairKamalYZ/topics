package be.techfi.mapstruct.example;

public class Credentials {

    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public Credentials username(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Credentials password(String password) {
        this.password = password;
        return this;
    }
}

