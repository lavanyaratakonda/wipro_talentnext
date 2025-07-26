package datetime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeBeforeHoursMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current time (HH:mm):");
        LocalTime currentTime = LocalTime.parse(scanner.nextLine());
        LocalTime timeBefore = currentTime.minusHours(5).minusMinutes(30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Current Time: " + currentTime.format(formatter));
        System.out.println("Time before 5 hours and 30 minutes: " + timeBefore.format(formatter));
    }
}