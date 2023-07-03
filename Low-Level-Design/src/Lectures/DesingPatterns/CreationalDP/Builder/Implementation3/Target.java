package Lectures.DesingPatterns.CreationalDP.Builder.Implementation3;

import java.security.InvalidParameterException;

public class Target { //Immutable Class
    private int mathsMarks;

    private int scienceMarks;
    private String name;

    private Target() {
    }

    public static Builder getBuilder() { //Return Type is Inner Class
        return new Builder();
    }

    public static class Builder { //Inner Class
        private int mathsMarks;
        private int scienceMarks;
        private String name;

        public int getScienceMarks() {
            return scienceMarks;
        }

        public Builder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this; //Returning Current/Builder Object -> For chaining
        }

        public int getMathsMarks() {
            return mathsMarks;
        }

        public Builder setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Target build() {
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
            //Step 2: Create Parent's Object //Outer class's object-Target's Object
            Target target = new Target();

            //Step 3: Copy values from Builder Object to Target Object
            target.scienceMarks = this.scienceMarks;
            target.mathsMarks = this.mathsMarks;
            target.name = this.name;
            return target;
        }
    }
}