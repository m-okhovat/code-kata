package org.example.main;

public class MathTools {
    public static int gcd(int a, int b) {
        while (b != 0) {
            var t = b;
            b = a % b;
            a = t;
        }

        return a;
    }
}
