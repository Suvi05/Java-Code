package Lectures.Polymorphism;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        User user1 = new Student();

        User user2 = new Mentor();
        //user2.description="Very Good";//Error b/c at compile time compiler is not sure about Data type of this "user"

        if (user2 instanceof Mentor) {
            ((Mentor) user2).description = "Very Good";
            //Now we can do that because we are sure that user2 is an instance of Mentor
        }

        User user3 = new TA();
        //user3.expertise="Java"; //Error

        List<User> users = List.of(
                user,
                user1,
                user2,
                user3,
                new Student(),
                new Mentor(),
                new TA()
        );
        changePasswordOfAllUsers(users);
    }

    public static void changePasswordOfAllUsers(List<User> users) {
        for (User user : users) {
            user.changeEmail(); //Here we will get to know about the Data type of USER
            if (user instanceof Student) { //Checking condition for Student data type
                System.out.println("I'm a student");
                //Mentor mentor = (Mentor) user;//Class cast exception -Runtime Exception
                Student student = (Student) user;//We can cast user to Student now, because now we are sure about it
                student.changeBatch();
                System.out.println(student.batch);
                student.batch = "May Batch"; //This time it is allowed because we are sure about the Data type of User
                System.out.println(((Student) user).batch);
            }
        }
    }
}
