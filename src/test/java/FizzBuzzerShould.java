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
    public void write_fizz_when_number_is_three() {
        // triangulation (adding new behaviour to the method)
        final String EXPECTED = "fizz";
        var fizzBuzzer = new FizzBuzzer();

        var write = fizzBuzzer.write(3);

        Assertions.assertEquals(EXPECTED,write);
    }

    @Test
    public void write_fizz_when_number_is_six() {
        // triangulation (adding new behaviour to the method)
        final String EXPECTED = "fizz";
        var fizzBuzzer = new FizzBuzzer();

        var write = fizzBuzzer.write(6);

        Assertions.assertEquals(EXPECTED, write);
    }


    @Test
    public void write_buzz_when_number_is_five(){
        // triangulation (adding new behaviour to the method)
        final String EXPECTED = "buzz";
        var fizzBuzzer = new FizzBuzzer();

        var write = fizzBuzzer.write(5);

        Assertions.assertEquals(EXPECTED, write);
    }

    @Test
    public void write_buzz_when_number_is_10(){
        // triangulation (adding new behaviour to the method)
        final String EXPECTED = "buzz";
        var fizzBuzzer = new FizzBuzzer();

        var write = fizzBuzzer.write(10);

        Assertions.assertEquals(EXPECTED, write);
    }

    @Test
    public void write_fizzbuzz_when_number_is_15(){
        final String EXPECTED = "fizzbuzz";
        var fizzBuzzer = new FizzBuzzer();

         var write = fizzBuzzer.write(15);

        Assertions.assertEquals(EXPECTED, write);
    }

    @Test
    public void write_fizzbuzz_when_number_is_30(){
        final String EXPECTED = "fizzbuzz";
        var fizzBuzzer = new FizzBuzzer();

        var write = fizzBuzzer.write(30);

        Assertions.assertEquals(EXPECTED, write);
    }
}
