package JavaTraining.Exceptions.ThrowsKeyoword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    void readfile() throws FileNotFoundException,ArithmeticException,NullPointerException {
        FileInputStream fis = new FileInputStream("");
    }

    public static void main(String[] args)  {
        CheckedException ce = new CheckedException();
        try {
            ce.readfile();
        } catch (FileNotFoundException e) {
            System.out.println("Ye wala me handle karunga apne tarike se");
        }
    }
}
