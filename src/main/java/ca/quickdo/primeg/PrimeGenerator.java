package ca.quickdo.primeg;

import java.util.ArrayList;

public class PrimeGenerator {
    public Integer[] getNPrimes(int n) {
        if (n <= 0) return new Integer[]{};
        else if (n < 4) return new Integer[]{1, 2, 3};
        else {
            var list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            for (int i = 3; i <= n; i++) {
                var isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    list.add(i);
            }

            return list.toArray(Integer[]::new);
        }
    }
}
