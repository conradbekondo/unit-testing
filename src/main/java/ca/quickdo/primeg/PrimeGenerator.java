package ca.quickdo.primeg;

import java.util.ArrayList;

public class PrimeGenerator {
    public Integer[] getNPrimes(int n) {
        if (n <= 0) return new Integer[]{};
        else if (n < 4) return new Integer[]{1, 2, 3};
        else {
            var list = new ArrayList<Integer>();



            return list.toArray(Integer[]::new);
        }
    }
}
