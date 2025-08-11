class ThreadsDemo1 implements Runnable {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadsDemo1 task = new ThreadsDemo1();

        Thread scooby = new Thread(task);
        scooby.setName("Scooby");

        Thread shaggy = new Thread(task);
        shaggy.setName("Shaggy");

        scooby.start();
        shaggy.start();
    }
}
