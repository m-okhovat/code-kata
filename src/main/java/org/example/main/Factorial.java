package org.example.main;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger calculate(int input) {
        var n = BigInteger.valueOf(input);

        if (n.equals(BigInteger.ONE)) return BigInteger.ONE;
        if (n.equals(BigInteger.ZERO))  return BigInteger.ZERO;
        var result = n.multiply(calculate(input-1));
        return result;

    }
}
