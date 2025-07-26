package datetime;
import java.time.LocalDate;
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check (YYYY):");
        int year = scanner.nextInt();
        
        boolean isLeap = LocalDate.of(year, 1, 1).isLeapYear();
        
        System.out.println(year + (isLeap ? " is a leap year" : " is not a leap year"));
    }
}