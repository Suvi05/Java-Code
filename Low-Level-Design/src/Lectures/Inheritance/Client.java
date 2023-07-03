package Lectures.Inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.name = "Sumit";
        //instructor.description = "Super Cool"; //We can do this when attributes are not private
        instructor.setDescription("Super Cool"); //Because now we have made it private

        User user = new User();
        user.name = "Scaler People";

        Mentor mentor = new Mentor();
        mentor.name = "Vidit Mathur";
        //mentor.description = "Boss"; //We can do this when attributes are not private
        mentor.setDescription("Boss"); //Because now we have made it private
        mentor.email = "vidit@microsoft.com";
    }
}
