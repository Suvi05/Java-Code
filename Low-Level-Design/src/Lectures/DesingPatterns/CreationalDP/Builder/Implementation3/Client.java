package Lectures.DesingPatterns.CreationalDP.Builder.Implementation3;

public class Client {
    public static void main(String[] args) {
        Target target;
        try {
            //Method Chaining
            target = Target.getBuilder()
                    .setName("Sumit")
                    .setScienceMarks(95)
                    .setMathsMarks(55)
                    .build();

            System.out.println("Object created Successfully!!");
        } catch (Exception exception) {
            System.out.println("Above parameters are Wrong");
        }
    }
}
