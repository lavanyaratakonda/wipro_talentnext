package map;

import java.util.*;

public class ContactList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> contactMap = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int phone = Integer.parseInt(sc.nextLine());
            contactMap.put(name, phone);
        }

        String nameToCheck = sc.nextLine();
        System.out.println(contactMap.containsKey(nameToCheck));

        int phoneToCheck = Integer.parseInt(sc.nextLine());
        System.out.println(contactMap.containsValue(phoneToCheck));

        Iterator<Map.Entry<String, Integer>> it = contactMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
