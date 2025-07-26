package map;

import java.util.*;

public class StateCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Properties properties = new Properties();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String state = sc.nextLine();
            String capital = sc.nextLine();
            properties.setProperty(state, capital);
        }
        Iterator<Object> it = properties.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + " : " + properties.getProperty(key));
        }
    }
}
