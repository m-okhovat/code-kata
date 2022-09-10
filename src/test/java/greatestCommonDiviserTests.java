import org.example.main.MathTools;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class greatestCommonDiviserTests {

    @Test
    void OneAndOne() {
        Assertions.assertEquals(1, MathTools.gcd(1, 1));
    }

    @Test
    void twoAndFour() {
        Assertions.assertEquals(2, MathTools.gcd(2, 4));
    }

    @Test
    void twoOddNumbers() {
        Assertions.assertEquals(4, MathTools.gcd(8, 12));
    }

    @Test
    void primeNumbers() {
        Assertions.assertEquals(1, MathTools.gcd(7,11));
    }


}


