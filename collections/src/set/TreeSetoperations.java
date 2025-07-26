package set;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;

public class TreeSetoperations {
    private TreeSet<String> H1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName) {
        Iterator<String> iterator = H1.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            if (country.equals(CountryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeSetoperations countrySet = new TreeSetoperations();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter country names to add to TreeSet (type 'exit' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            countrySet.saveCountryNames(input);
        }

        System.out.println("Enter a country name to search (type 'exit' to stop):");
        while (true) {
            String searchInput = scanner.nextLine();
            if (searchInput.equalsIgnoreCase("exit")) {
                break;
            }
            String result = countrySet.getCountry(searchInput);
            System.out.println(result != null ? "Country found: " + result : "Country not found.");
        }

        scanner.close();
    }
}