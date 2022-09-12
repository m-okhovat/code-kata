import org.example.main.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FractionEqualsTests {

    @Test
    void negative_equality() {
        Assertions.assertEquals(new Fraction(2, 4),
                new Fraction(-1, -2));

    }

    @Test
    void not_same_denominators() {
        Assertions.assertEquals(new Fraction(31, 35)
                , new Fraction(3, 5)
                        .plus(new Fraction(2, 7)));
    }
}
