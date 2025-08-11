class PriorityTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
    }
}

public class ThreadDemo5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PriorityTask(), "MAX");
        Thread t2 = new Thread(new PriorityTask(), "MIN");
        Thread t3 = new Thread(new PriorityTask(), "NORM");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}