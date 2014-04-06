package org.ninit.training.dynamic;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static Map<Integer, Integer> cache;
    static {
        cache = new HashMap<Integer, Integer>();
        cache.put(0, 0);
        cache.put(1, 1);
    }

    public static int fib1(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }

    public static int fib2(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            cache.put(n, fib2(n - 1) + fib2(n - 2));
        }
        return cache.get(n);

    }

    public static int fib3(int n) {
        int[] previous = new int[] { 0, 1 };
        int result = 0;
        if (n == 1) {
            result = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                result = previous[0] + previous[1];
                previous[0] = previous[1];
                previous[1] = result;
            }
        }
        return result;
    }
}
