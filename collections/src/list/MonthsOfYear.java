package list;

import java.util.ArrayList;

public class MonthsOfYear {
    public static void main(String[] args) {
        // Create an ArrayList to store months
        ArrayList<String> months = new ArrayList<>();
        
        // Add all months to the ArrayList
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        
        // Print all months
        System.out.println("Months of the year:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}