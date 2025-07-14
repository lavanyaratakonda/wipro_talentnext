package optional;

import java.util.Optional;
import java.util.Scanner;

public class Stringaddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();
        Optional<String> opt = Optional.ofNullable(address);
        System.out.println(opt.orElse("India"));
    }
}
