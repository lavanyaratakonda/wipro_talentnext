package thread;

import java.util.Scanner;

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " with priority " + getPriority() + " - Count: " + i);
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name for Thread 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter priority for " + name1 + " (1 to 10): ");
        int priority1 = scanner.nextInt();

        scanner.nextLine(); 
        System.out.print("Enter name for Thread 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter priority for " + name2 + " (1 to 10): ");
        int priority2 = scanner.nextInt();

        scanner.nextLine(); 
        System.out.print("Enter name for Thread 3: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter priority for " + name3 + " (1 to 10): ");
        int priority3 = scanner.nextInt();
        PriorityThread t1 = new PriorityThread(name1);
        PriorityThread t2 = new PriorityThread(name2);
        PriorityThread t3 = new PriorityThread(name3);

        t1.setPriority(priority1);
        t2.setPriority(priority2);
        t3.setPriority(priority3);
        t1.start();
        t2.start();
        t3.start();

        scanner.close();
    }
}
