package my;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

    @Test
    public void test_greet() {
        String expected = "Hello, world!";
        String actual = new Greeter().greet("Banksy");
        assertEquals(expected, actual);
    }
}
