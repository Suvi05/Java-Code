package Lectures.DesingPatterns.CreationalDP.Builder.Implementation1;

import java.security.InvalidParameterException;

public class UserExam {
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    public UserExam(Parameter p) {
        if (p.mathsMarks > 100 || p.scienceMarks > 100) {//Validation
            System.out.println("Marks can't be greater than 100");
            throw new InvalidParameterException("Marks can't be greater than 100");
        }

        if (p.name.startsWith("0")) {
            System.out.println("Name can't start with 0");
            throw new InvalidParameterException("Name can't start with 0");
        }

        this.mathsMarks = p.mathsMarks;
        this.scienceMarks = p.scienceMarks;
        this.name = p.name;
    }
}