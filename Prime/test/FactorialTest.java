import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    Factorial primeNumber = null;
    @Before
    public void setup() {
        primeNumber = new Factorial();
    }

    @Test
    public void shouldReturnValue1ForArgumentsLessThanOrEqualTo1() {
        int factorial = primeNumber.calculate(0);
        assertThat(1, is(factorial));

    }

    @Test
    public void shouldReturn24ForArgument4() {
        int factorial = primeNumber.calculate(4);
        assertThat(24, is(factorial));

    }
}