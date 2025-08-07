package thread;

import java.util.Random;

public class ColorDisplay implements Runnable {
    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    Random rand = new Random();

    @Override
    public void run() {
        while (true) {
            int index = rand.nextInt(colours.length);
            String color = colours[index];

            System.out.println("Color: " + color);

            if (color.equalsIgnoreCase("red")) {
                System.out.println("Red encountered! Stopping...");
                break;
            }

            try {
                Thread.sleep(500); // Small delay to slow down output
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ColorDisplay());
        t.start();
    }
}
