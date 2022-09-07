import org.example.main.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class FactorialTests {
    @Test
    public void one_factorial() {

        var result = new Factorial().calculate(1);

        Assertions.assertEquals(1 , result);
    }

    @Test
    void zero_factorial() {

        var result  = new Factorial().calculate(0);

        Assertions.assertEquals(0, result);
    }

    @Test
    void factorial_two() {
        var result  = new Factorial().calculate(2);

        Assertions.assertEquals(2, result);
    }

    @Test
    void factorial_three() {
        var result = new Factorial().calculate(3);

        Assertions.assertEquals(6, result);
    }

    @Test
    void factorial_four() {
        var result = new Factorial().calculate(6);

        Assertions.assertEquals(BigInteger.valueOf(720), result);
    }
}

