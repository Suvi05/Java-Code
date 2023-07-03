package Lectures.Inheritance;

public class User {
    String name;
    String email;
    String password;

    void saySomething() {
        System.out.println("Say Something");
    }

    void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    void changePassword(String newPassword) {
        this.password = newPassword;
    }
}
