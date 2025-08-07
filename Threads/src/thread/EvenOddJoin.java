package thread;

import java.util.Scanner;

class EvenThread extends Thread {
    private int limit;

    public EvenThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    private int limit;

    public OddThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class EvenOddJoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int limit = scanner.nextInt();

        EvenThread even = new EvenThread(limit);
        OddThread odd = new OddThread(limit);

        even.start(); // Start even thread first
        try {
            even.join(); // Wait for even thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        odd.start(); // Start odd thread after even thread completes

        scanner.close();
    }
}
