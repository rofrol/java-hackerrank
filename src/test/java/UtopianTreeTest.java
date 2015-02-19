import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtopianTreeTest {
    @Test public void testFlippingBitsMethod() {
        UtopianTree classUnderTest = new UtopianTree();
        assertEquals(classUnderTest.utopianTree(0), 1L);
        assertEquals(classUnderTest.utopianTree(1), 2L);
        assertEquals(classUnderTest.utopianTree(4), 7L);
        assertEquals(classUnderTest.utopianTree(3), 6L);
    }
}
