package datetime;
import java.time.LocalDate;
import java.util.Scanner;

public class DateAfterTenDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today's date (yyyy-mm-dd):");
        LocalDate today = LocalDate.parse(scanner.nextLine());
        LocalDate afterTenDays = today.plusDays(10);
        
        System.out.println("Today's date: " + today);
        System.out.println("Date after ten days: " + afterTenDays);
    }
}