package map;

import java.util.*;

public class CountryCapitalTreeMap {
    private TreeMap<String, String> M1 = new TreeMap<>();

    public TreeMap<String, String> saveCountryCapital(String CountryName, String capital) {
        M1.put(CountryName, capital);
        return M1;
    }

    public String getCapital(String CountryName) {
        return M1.get(CountryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) return entry.getKey();
        }
        return null;
    }

    public TreeMap<String, String> swapKeyValue() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> toArrayList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountryCapitalTreeMap obj = new CountryCapitalTreeMap();
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            obj.saveCountryCapital(input[0], input[1]);
        }
        String query1 = sc.nextLine().trim();
        System.out.println(obj.getCapital(query1));
        String query2 = sc.nextLine().trim();
        System.out.println(obj.getCountry(query2));
        TreeMap<String, String> swapped = obj.swapKeyValue();
        for (Map.Entry<String, String> e : swapped.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        ArrayList<String> list = obj.toArrayList();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
