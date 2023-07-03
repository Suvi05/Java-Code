package JavaTraining.Exceptions.UncheckedExceptionHandling;

public class StringParser {

    public static void main(String[] args) {
       try {
           String s="20a4";
           int i= Integer.parseInt(s);
           System.out.println(i);
       }
       catch (NumberFormatException e){
           System.out.println("Sorry you have to enter Numbers in a String only");
       }
    }
}
