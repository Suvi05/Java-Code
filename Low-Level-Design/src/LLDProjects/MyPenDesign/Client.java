package LLDProjects.MyPenDesign;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is main client file");

        Pen p = PenFactory.createPen(Type.BALL);
        p.setBrand("Reynolds");
        p.setCost(20);
        p.write();
    }
}
