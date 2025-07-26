package functionalInterface;

import java.util.*;
import java.util.function.Supplier;

public class PrimeSupplier {
    public static void main(String[] args) {
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;
            while (primes.size() < 10) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) primes.add(num);
                num++;
            }
            return primes;
        };

        ArrayList<Integer> primes = primeSupplier.get();
        System.out.println("First 10 prime numbers:");
        primes.forEach(System.out::println);
    }
}
