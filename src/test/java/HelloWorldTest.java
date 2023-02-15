import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    Main m = new Main();

    @Test
    public void checkHelloWorld() {
        assertEquals("Hello World", m.print());
    }
}
