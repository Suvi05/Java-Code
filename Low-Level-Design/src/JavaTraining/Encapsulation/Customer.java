package JavaTraining.Encapsulation;

public class Customer {

    private String firstName; //Security firstName="Sumit"
    private String lastName;
    private String creditCard;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName==null){
            System.out.println("Sorry but your name can't be Null");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
}
