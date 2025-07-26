package datetime;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;
import java.util.Scanner;

public class NextMonthSecondSunday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current date (yyyy-mm-dd):");
        LocalDate currentDate = LocalDate.parse(scanner.nextLine());
        
        LocalDate nextMonth = currentDate.plusMonths(1).withDayOfMonth(1);
        LocalDate secondSunday = nextMonth.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
        
        System.out.println("Next month's second Sunday: " + secondSunday);
    }
}