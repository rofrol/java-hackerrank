import org.junit.Test;
import static org.junit.Assert.*;

public class SolveMeFirstTest {
    @Test public void testAddMethod() {
        SolveMeFirst classUnderTest = new SolveMeFirst();
        assertEquals(classUnderTest.add(2, 3), 5);
    }
}
