package org.ninit.training.search.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;
import org.ninit.training.search.QuickSelect;
import org.ninit.training.utils.Utils;

public class QuickSelectTest {

    @Test
    public void test() {
        int[] input = Utils.getRandom(10000);
        int element = new Random().nextInt(10000);
        QuickSelect qs = new QuickSelect();
        int found = qs.findElement(input, element);

        Arrays.sort(input);

        assertEquals(input[element], found);
        
        System.out.println();
    }

}
