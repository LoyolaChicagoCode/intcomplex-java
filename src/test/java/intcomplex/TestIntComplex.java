package intcomplex;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIntComplex {
    private IntComplex c1 = null;
    private IntComplex c2 = null;

    @Before
    public void setUp() throws Exception {
        c1 = new DefaultIntComplex(1, 0);
        c2 = new DefaultIntComplex(0, 1);
    }

    @After
    public void tearDown() throws Exception {
        c1 = c2 = null;
    }

    @Test
    public void initialization() {
        assertNotNull(c1);
    }

    @Test
    public void checkReal() { // this test is OK as-is, it should pass with no problem
        assertTrue(c1.real() == 1);
    }

    @Test
    public void checkImag() { // this test is OK as-is, it should pass with no problem
        assertTrue(c1.imag() == 0);
    }

    @Test
    public void checkEqual1() { // this test is OK as-is, it should pass with no problem
        assertEquals("1+0i", c1.toString());
    }

    @Test
    public void self() { // this test is OK as-is, it should pass with no problem
        assertTrue(c1.equals(c1));
    } // equality

    @Test
    public void notSelf() { // this test is OK as-is, it should pass with no problem
        assertFalse(c2.equals(c1));
    } // non-equality

    @Test
    public void selfNotNull() { // this test is OK as-is, it should pass with no problem
        assertFalse(c1.equals(null));
    } // never null

    @Test
    public void checkInterchange() { assertEquals(c1, c2.interchange()); // equality
    }

    @Test
    public void notSelf2() { // this test is OK as-is, it should pass with no problem
        assertFalse(c1.equals(c2));
    } // continued non-equality
}
