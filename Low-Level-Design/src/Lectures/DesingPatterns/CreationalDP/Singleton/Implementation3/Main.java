package Lectures.DesingPatterns.CreationalDP.Singleton.Implementation3;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            Database database = Database.getInstance("Thread 1");
            System.out.println(database.val);
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            Database database = Database.getInstance("Thread 2");
            System.out.println(database.val);
        }
    }
}
