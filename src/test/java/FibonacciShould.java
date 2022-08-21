import org.example.main.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// three simple rules:
//        You are not allowed to write any production code unless it is to make a failing unit test pass.
//        You are not allowed to write any more of a unit test than is sufficient to fail; and compilation failures are failures.
//        You are not allowed to write any more production code than is sufficient to pass the one failing unit test.
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
