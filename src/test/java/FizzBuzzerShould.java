import org.example.main.FizzBuzzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FizzBuzzerShould {

    @Test
    public void write_number_one() {
        // fake it
        var fizzBuzzer = new FizzBuzzer();
        final String EXPECTED = "1";

        var write = fizzBuzzer.write(1);

        Assertions.assertEquals(EXPECTED, write);
    }

    @Test
    public void write_number_two() {
        // obvious implementation
        var fizzBuzzer = new FizzBuzzer();
        final String EXPECTED = "2";

        var write = fizzBuzzer.write(2);

        Assertions.assertEquals(EXPECTED, write);
    }

    @Test
    public void write_number_four() {
        // obvious implementation
        var fizzBuzzer = new FizzBuzzer();
        final String EXPECTED = "4";

        var write = fizzBuzzer.write(4);

        Assertions.assertEquals(EXPECTED, write);
    }

    @Test
    public void write_number_seven() {
        // obvious implementation. see the duplication and refactor it.
        var fizzBuzzer = new FizzBuzzer();
        final String EXPECTED = "7";

        var write = fizzBuzzer.write(7);

        Assertions.assertEquals(EXPECTED, write);
    }

    @Test
    public void write_fizz_when_number_is_three() {
        // triangulation (adding new behaviour to the method)
        final String EXPECTED = "fizz";
        var fizzBuzzer = new FizzBuzzer();

        var write = fizzBuzzer.write(3);

        Assertions.assertEquals(write, EXPECTED);
    }

    @Test
    public void write_fizz_when_number_is_six() {
        // triangulation (adding new behaviour to the method)
        final String EXPECTED = "fizz";
        var fizzBuzzer = new FizzBuzzer();

        var write = fizzBuzzer.write(6);

        Assertions.assertEquals(EXPECTED, write);
    }

}
