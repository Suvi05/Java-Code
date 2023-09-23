package Lectures.Inheritance;

public class User {
    String name;
    String email;
    String password;

    private String test; //We can not directly access this in other classes, but using setters and getters we can!

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
