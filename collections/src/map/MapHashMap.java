package map;

import java.util.*;

public class MapHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String key = sc.nextLine();
            String value = sc.nextLine();
            map.put(key, value);
        }

        String keyToCheck = sc.nextLine();
        System.out.println(map.containsKey(keyToCheck));

        String valueToCheck = sc.nextLine();
        System.out.println(map.containsValue(valueToCheck));

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
