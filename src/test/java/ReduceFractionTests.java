import org.example.main.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReduceFractionTests {
    @Test
    void reducer_Not_two_whole_numbers() {
        assertEquals(new Fraction(3,4) , new Fraction(6,8));
    }

    @Test
    void reduce_Two_whole_numbers() {

        assertEquals(new Fraction(2), new Fraction(12, 6));
    }

    @Test
    void reduce_zero() {

        assertEquals(new Fraction(0), new Fraction(0, 1234));
    }

}
