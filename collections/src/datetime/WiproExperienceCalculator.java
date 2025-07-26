package datetime;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class WiproExperienceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your joining date at Wipro (yyyy-mm-dd):");
        LocalDate joiningDate = LocalDate.parse(scanner.nextLine());
        LocalDate currentDate = LocalDate.now();
        
        Period experience = Period.between(joiningDate, currentDate);
        
        System.out.println("Your experience in Wipro:");
        System.out.println("Years: " + experience.getYears());
        System.out.println("Months: " + experience.getMonths());
        System.out.println("Days: " + experience.getDays());
    }
}