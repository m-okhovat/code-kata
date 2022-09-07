import org.example.main.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EqualsTest {
    @Test
    void same_numerator_and_denominator() {

        assertEquals(new Fraction(3,5) , new Fraction(3,5));
    }

    @Test
    void different_fractions() {
        assertNotEquals(new Fraction(3,7), new Fraction(6,7));
    }

    @Test
    void Whole_number_equals_fraction() {
        assertEquals(new Fraction(5), new Fraction(5,1));
    }

    @Test
    void whole_number_not_equals() {
        assertNotEquals(new Fraction(5), new Fraction(4));
    }

    @Test
    void different_denominators_without_reducing() {
        assertEquals(new Fraction(5,6),
                new Fraction(1, 3).plus(new Fraction(1, 2)));
    }

    //    @Test
//    void reduce() {
//        assertEquals(new Fraction(3,4) ,new Fraction(6,8));
//    }


}
