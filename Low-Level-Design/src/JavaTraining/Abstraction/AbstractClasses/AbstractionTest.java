package JavaTraining.Abstraction.AbstractClasses;

public class AbstractionTest {
    public static void main(String[] args) {


        ThreeSeries ts = new ThreeSeries();
        ts.commonFunction();//Inherited
        ts.accelerate();   //New Implemented
    }
}
