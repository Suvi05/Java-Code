package JavaTraining.Multithreading.Masterclass.ThreadPoolCode;

public class NumberPrinter implements Runnable {
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Number : " + number + " Printed from Thread : " + Thread.currentThread().getName());
    }
}
