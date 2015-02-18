import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolveMeSecondTest {
    @Test public void testAddMethod() {
        SolveMeSecond classUnderTest = new SolveMeSecond();
        assertEquals(classUnderTest.add(2, 3), 5);
        assertEquals(classUnderTest.add(3, 7), 10);
    }
}
