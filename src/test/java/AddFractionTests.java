import org.example.main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddFractionTests {
    @Test
    void zero_plus_zero() {

        Fraction sum = new Fraction(0, 5)
                .plus(new Fraction(0, 5));

        Assertions.assertEquals(0, sum.toIntValue());
    }

    @Test
    void positive_plus_zero() {

        Fraction sum = new Fraction(1, 5).plus(new Fraction(0, 5));

        Assertions.assertEquals(1, sum.toIntValue());
    }

    @Test
    public void zero_plus_positive() {

        var sum = new Fraction(0, 5).plus(new Fraction(3, 5));

        Assertions.assertEquals(3, sum.toIntValue());
    }

    @Test
    void positive_plus_positive() {

        Fraction sum = new Fraction(3, 5).plus(new Fraction(2, 5));

        Assertions.assertEquals(1, sum.toIntValue());
    }

    @Test
    void nonTrivial_positive_plus_to_nonTrivial_positive_common_denominator() {


        var sum = new Fraction(1, 5)
                .plus(new Fraction(2, 5));

        assertEquals(5, sum.getDenominator());
        assertEquals(3, sum.getNumerator());
    }

    @Test
    void common_factors_in_denominators() {
        assertEquals(new Fraction(11, 8), new Fraction(3,4)
                .plus(new Fraction(5,8)));
    }

    @Test
    void adding_two_negative_numbers() {
        assertEquals(new Fraction(1,2),
                new Fraction(-1, 4).plus(new Fraction(-3, -4)));
    }
}

