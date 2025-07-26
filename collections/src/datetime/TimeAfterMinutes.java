package datetime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeAfterMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current time (HH:mm):");
        LocalTime currentTime = LocalTime.parse(scanner.nextLine());
        LocalTime timeAfter25 = currentTime.plusMinutes(25);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Current Time: " + currentTime.format(formatter));
        System.out.println("Time after 25 minutes: " + timeAfter25.format(formatter));
    }
}