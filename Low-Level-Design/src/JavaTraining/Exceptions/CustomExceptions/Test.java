package JavaTraining.Exceptions.CustomExceptions;

public class Test {
    public static void main(String[] args) {
        //throw new UncheckedCustomException("Exception Aayi h Bhai");
        try {
            throw new CheckedCustomException("Checked Exception hu me...");
        } catch (CheckedCustomException e) {
            e.printStackTrace();
        }
    }
}
