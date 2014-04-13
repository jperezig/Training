package org.ninit.training.others;

import static org.junit.Assert.*;

import org.junit.Test;

public class InverseStringTest {

    @Test
    public void test() {
        assertTrue("1".equals(InverseString.reverseInPlace("1")));
        assertTrue("12".equals(InverseString.reverseInPlace("21")));
        assertTrue("123".equals(InverseString.reverseInPlace("321")));
        assertTrue("1234".equals(InverseString.reverseInPlace("4321")));
    }

}
