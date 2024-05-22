package esercizioi_3;

public class Cliente {
    int clientCode;
    String name;
    String surname;
    String email;
    int dateOfRegistration;

    public Cliente(int clientCode, String name, String surname, String email, int dateOfRegistration) {
        this.clientCode = clientCode;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfRegistration = dateOfRegistration;
    }
}
