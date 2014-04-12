package org.ninit.training.search.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ninit.training.search.FindLongestPalindrom;

public class FindLongestPalindromTest {

    private String input1 = "";
    private String output1 = "";
    private String input2 = "adam";
    private String output2 = "ada";
    private String input3 = "madam";
    private String output3 = "madam";
    private String input4 = "repd abut tubas por";
    private String output4 = "abut tuba";

    @Test
    public void test() {
        assertEquals(FindLongestPalindrom.getAllSubStrings(input1), output1);
        assertEquals(FindLongestPalindrom.getAllSubStrings(input2), output2);
        assertEquals(FindLongestPalindrom.getAllSubStrings(input3), output3);
        assertEquals(output4, FindLongestPalindrom.getAllSubStrings(input4));
    }

}
