class EvenPrinter implements Runnable {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class OddPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println(i);
        }
    }
}

public class ThreadsDemo4 {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        evenThread.start();

        try {
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        oddThread.start();
    }
}
