package miniproject;

import java.util.Scanner;

class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        this.checkout = true;
    }

    public void doReturn() {
        this.checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}

class VideoStore {
    private Video[] store;
    private int count;

    public VideoStore() {
        store = new Video[100];
        count = 0;
    }

    public void addVideo(String name) {
        store[count++] = new Video(name);
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equals(name) && !store[i].getCheckout()) {
                store[i].doCheckout();
                System.out.println("Video \"" + name + "\" checked out.");
                return;
            }
        }
        System.out.println("Video not available for checkout.");
    }

    public void doReturn(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equals(name) && store[i].getCheckout()) {
                store[i].doReturn();
                System.out.println("Video \"" + name + "\" returned.");
                return;
            }
        }
        System.out.println("Video not found or not checked out.");
    }

    public void receiveRating(String name, int rating) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equals(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating " + rating + " has been mapped to the video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {
        System.out.println("\nCurrent Inventory:");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + store[i].getName() +
                    " | Rating: " + store[i].getRating() +
                    " | Available: " + (!store[i].getCheckout()));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();

        while (true) {
            System.out.println("\n=== Video Store Menu ===");
            System.out.println("1. Add Video");
            System.out.println("2. Checkout Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter video name: ");
                    String nameToAdd = sc.nextLine();
                    store.addVideo(nameToAdd);
                    break;

                case 2:
                    System.out.print("Enter video name to checkout: ");
                    String nameToCheckout = sc.nextLine();
                    store.doCheckout(nameToCheckout);
                    break;

                case 3:
                    System.out.print("Enter video name to return: ");
                    String nameToReturn = sc.nextLine();
                    store.doReturn(nameToReturn);
                    break;

                case 4:
                    System.out.print("Enter video name: ");
                    String nameToRate = sc.nextLine();
                    System.out.print("Enter rating (1-10): ");
                    int rating = sc.nextInt();
                    store.receiveRating(nameToRate, rating);
                    break;

                case 5:
                    store.listInventory();
                    break;

                case 6:
                    System.out.println("Exiting Video Store. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}