import java.util.Random;
class ThreadsDemo2 implements Runnable {
    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    Random random = new Random();

    public void run() {
        while (true) {
            int index = random.nextInt(colours.length);
            String selected = colours[index];
            System.out.println("Colour: " + selected);

            if (selected.equalsIgnoreCase("red")) {
                System.out.println("Red found! Stopping thread.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        ThreadsDemo2 task = new ThreadsDemo2();
        Thread t = new Thread(task);
        t.start();
    }
}
