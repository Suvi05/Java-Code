package JavaTraining.Multithreading;

public class SingleThreaded {
    public static void main(String[] args) {
        SingleThreaded st = new SingleThreaded();
        st.printNumbers();

        for (int j = 1; j <= 100; j++) {
            System.out.print("j : " + j + "\t");
        }
    }

    public static void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.print("i : " + i + "\t");
        }
    }
}
