package classes_Objects;

import java.util.Scanner;

class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer base: ");
        int baseInt = scanner.nextInt();
        System.out.print("Enter integer exponent: ");
        int expInt = scanner.nextInt();
        int intResult = Calculator.powerInt(baseInt, expInt);
        System.out.println(baseInt + " raised to the power " + expInt + " is: " + intResult);

        System.out.print("Enter double base: ");
        double baseDouble = scanner.nextDouble();
        System.out.print("Enter integer exponent: ");
        int expDouble = scanner.nextInt();
        double doubleResult = Calculator.powerDouble(baseDouble, expDouble);
        System.out.println(baseDouble + " raised to the power " + expDouble + " is: " + doubleResult);

        scanner.close();
    }
}
