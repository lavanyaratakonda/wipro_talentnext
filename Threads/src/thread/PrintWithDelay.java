package thread;
import java.util.Scanner;

public class PrintWithDelay extends Thread {
    private int limit;
    private int delayAfter;

    public PrintWithDelay(int limit, int delayAfter) {
        this.limit = limit;
        this.delayAfter = delayAfter;
    }

    public void run() {
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
            if (i == delayAfter) {
                try {
                    System.out.println("Pausing for 5 seconds...");
                    Thread.sleep(5000); // 5000 milliseconds = 5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit (e.g., 10): ");
        int limit = scanner.nextInt();

        System.out.print("Enter the number after which delay should happen (e.g., 5): ");
        int delayAfter = scanner.nextInt();

        PrintWithDelay thread = new PrintWithDelay(limit, delayAfter);
        thread.start();

        scanner.close();
    }
}
