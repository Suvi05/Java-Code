package Lectures.DesingPatterns.CreationalDP.Builder.Implementation2;

import java.security.InvalidParameterException;

public class UserExam {
    private int scienceMarks;
    private int mathsMarks;
    private String name;

    //Constructor of UserExam is Empty
    //So we are creating an object of Builder and then Copying it to UserExam
    //We are making it private so that no one can access it and create object without validations
    private UserExam() {
    }

    public static Builder getBuilder() {
        //static - so that we can call it by class name from Client ie. UserExam.getBuilder();
        return new Builder();
    }

    //Static things can only access static things that's why we have to make this class as static
    public static class Builder { //Inner Class
        private int scienceMarks;
        private int mathsMarks;
        private String name;

        public int getScienceMarks() {
            return scienceMarks;
        }

        //To access private attributes of Builder we are using these Getters and Setters
        //UserExam Class is immutable but not Builder, So we can use "Setters" here.
        public void setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
        }

        public int getMathsMarks() {
            return mathsMarks;
        }

        public void setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        //

        public UserExam build() {

            //Step 1: Validation
            if (scienceMarks > 100 || mathsMarks > 100) {
                System.out.println("Marks can't be greater than 100");
                throw new InvalidParameterException("Marks can't be greater than 100");
            }
            if (mathsMarks + scienceMarks > 150) { //Cross parameter validations
                System.out.println("Math + Science marks can't be greater than 150");
                throw new InvalidParameterException("Math + Science marks can't be greater than 150");
            }
            if (name.startsWith("0")) {
                System.out.println("Name can't start with 0");
                throw new InvalidParameterException("Name can't start with 0");
            }

            //Step 2: Create Parent's Object //Outer class's object- UserExam's Object
            UserExam userExam = new UserExam();

            //Step 3: Copying Values from Builder Object to UserExam's Object
            userExam.scienceMarks = this.scienceMarks;
            userExam.mathsMarks = this.mathsMarks;
            userExam.name = this.name;

            return userExam;
        }
    }
}