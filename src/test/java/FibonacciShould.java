import org.example.main.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciShould {
    @Test
    public void calculate_number_at_defined_position(){
        var fibonacci  = new Fibonacci();

        Assertions.assertEquals(0,fibonacci.number(0));
        Assertions.assertEquals(1,fibonacci.number(1));
        Assertions.assertEquals(1,fibonacci.number(2));
        Assertions.assertEquals(2,fibonacci.number(3));
        Assertions.assertEquals(8,fibonacci.number(6));

    }
}
