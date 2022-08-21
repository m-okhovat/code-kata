import org.example.main.StatsCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StatsCalculatorShould {
    @Test
    public void find_minimum_number() {
        final List<Integer> ELEMENTS = Arrays.asList(1, 2, 3, -12, 10, -2, -3, 12);

        StatsCalculator statsCalculator = new StatsCalculator();

        int minimum = statsCalculator.getMinimum(ELEMENTS);

        Assertions.assertEquals(-12, minimum);
    }

    @Test
    public void find_maximum_number() {
        final List<Integer> ELEMENTS = Arrays.asList(1, 2, 3, -12, 10, -2, -3, 12);

        var statsCalculator = new StatsCalculator();

        int maximum = statsCalculator.getMaximum(ELEMENTS);

        Assertions.assertEquals(12, maximum);
    }

    @Test
    public void find_number_of_elements_in_some_elements() {

        List<Integer> ELEMENTS = Arrays.asList(1, 2, 3, -12, 10, -2, -3, 12, 34);

        var statusCalculator = new StatsCalculator();

        int count = statusCalculator.count(ELEMENTS);

        Assertions.assertEquals(9, count);
    }

}
