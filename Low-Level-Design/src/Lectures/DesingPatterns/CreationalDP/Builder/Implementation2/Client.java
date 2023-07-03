package Lectures.DesingPatterns.CreationalDP.Builder.Implementation2;

public class Client {
    public static void main(String[] args) {
        UserExam userExam;

        try {
            UserExam.Builder b = UserExam.getBuilder();

            b.setName("Sumit");
            b.setScienceMarks(40);
            b.setMathsMarks(40);

            userExam = b.build();

            System.out.println("Object created Successfully!!");
        } catch (Exception exception) {
            System.out.println("Above parameters are Wrong");
        }
    }
}
