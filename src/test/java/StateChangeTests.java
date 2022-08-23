import org.example.main.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateChangeTests {

    @Test
    public void regular_customer_discount(){

        Customer customer = new Customer();

        assertEquals(0,customer.getDiscount());
    }

    @Test
    void preferred_customer_discount() {

        var customer = new Customer();

        customer.Promote();

        assertEquals(0.5, customer.getDiscount());
    }

}
