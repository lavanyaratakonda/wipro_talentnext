package classes_Objects;
import java.util.Scanner;

class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter depth: ");
        double depth = scanner.nextDouble();

        Box myBox = new Box(width, height, depth);
        System.out.println("Volume of the box is: " + myBox.getVolume());

        scanner.close();
    }
}
