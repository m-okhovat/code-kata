import org.example.main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddFractionTests {
    @Test
    void zero_plus_zero() {

        Fraction sum = new Fraction(0)
                        .plus(new Fraction(0));

        Assertions.assertEquals(0, sum.toIntValue());
    }

    @Test
    void positive_plus_zero() {

        Fraction sum = new Fraction(1).plus(new Fraction(0));

        Assertions.assertEquals(1, sum.toIntValue());
    }

    @Test
    void positive_plus_positive() {

        Fraction sum = new Fraction(3).plus(new Fraction(2));

        Assertions.assertEquals(5, sum.toIntValue());
    }
}
