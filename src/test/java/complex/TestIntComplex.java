package complex;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIntComplex {
    final private IntComplex c1 = new DefaultIntComplex(1, 0);
    final private IntComplex c2 = new DefaultIntComplex(0, 1);

@Before
public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void initialization() {
        assertNotNull(c1);
    }

    @Test
    public void checkReal() { // this test is OK as-is, it should pass with no problem
        assertEquals(1, c1.real());
    }

    @Test
    public void checkImag() { // this test is OK as-is, it should pass with no problem
        assertTrue(c1.imag() == 0);
    }

    @Test
    public void checkequal1() { // this test is OK as-is, it should pass with no problem
        assertEquals("1+0i", c1.toString());
    }

    @Test
    public void self1() { // this test is OK as-is, it should pass with no problem
        assertTrue(c1.equals(c1));
    }

    @Test
    public void self2() { // this test is OK as-is, it should pass with no problem
        assertFalse(c2.equals(c1));
    }

    @Test
    public void selfnull() { // this test is OK as-is, it should pass with no problem
        assertFalse(c1.equals(null));
    }

 /*   @Test
    public void checkswitch() { // this test is OK as-is, it should pass with no problem
        assertEquals(c1, c2.twitch());
    }*/

}
