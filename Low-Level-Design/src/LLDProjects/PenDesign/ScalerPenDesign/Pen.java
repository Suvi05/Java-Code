package LLDProjects.PenDesign.ScalerPenDesign;

import LLDProjects.PenDesign.ScalerPenDesign.Strategies.WriteStrategies.WriteBehaviour;

public abstract class Pen {
    private String name;
    private String company;
    private int price;
    private PenType type;

    private WriteBehaviour writeBehaviour; //From Strategies DP


    //Constructor <- We will set the value of Type using this
    //Code in case of we implement Strategy DP
    public Pen(PenType penType, WriteBehaviour writeBehaviour) {
        this.type = penType;
        this.writeBehaviour = writeBehaviour;
    }
    //It is a good practice that whenever you have different child classes with different types
    //Put the type attribute instead of using "instanceOf" operator in Java.
    //PenType -> this will be called in each child class's constructor to set the type of it.

//    public Pen(PenType penType) {
//        this.type = penType;
//    }


    //These two methods will be there in every pen.
    public void write() { //Type will come from the Constructor of Pen
        this.writeBehaviour.write();
    }
    //Different pens might have similar write behaviour, so for that we will implement Strategy Design pattern

    public abstract Color getColor();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PenType getType() {
        return type;
    }

    public void setType(PenType type) {
        this.type = type;
    }
}
