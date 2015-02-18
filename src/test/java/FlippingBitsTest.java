import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlippingBitsTest {
    @Test public void testFlippingBitsMethod() {
        FlippingBits classUnderTest = new FlippingBits();
        assertEquals(classUnderTest.flippingBits(2147483647), 2147483648L);
        assertEquals(classUnderTest.flippingBits(1), 4294967294L);
        assertEquals(classUnderTest.flippingBits(0), 4294967295L);
    }
}
