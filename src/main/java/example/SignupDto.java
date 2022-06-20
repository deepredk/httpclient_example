package example;

public class SignupDto {
    private String email;
    private String password;
    private String contact;
    private String address;

    public SignupDto(String email, String password, String contact, String address) {
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getContact() {
        return contact;
    }
    public String getAddress() {
        return address;
    }
}
