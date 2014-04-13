package org.ninit.training.hackrank;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class CriticsTest {

    private static String problem1 = "4 4\n1 3 2\n4 2\n1 2\n3 4 1\n";
    private static String solution1 = "2\n0 3\n1 2\n";

    private static String problem2 = "4 4\n1\n3 1 4\n4 1\n2 1\n";
    private static String solution2 = "2\n0 3\n1 2\n";

    @Test
    public void test() throws IOException {

        InputStream in = new ByteArrayInputStream(problem1.getBytes());
        ByteArrayOutputStream outBytes = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outBytes);
        Critics.solve(Critics.read(in), out);
        assertEquals(solution1, outBytes.toString());
        in.close();
        out.close();

        in = new ByteArrayInputStream(problem2.getBytes());
        outBytes = new ByteArrayOutputStream();
        out = new PrintStream(outBytes);
        Critics.solve(Critics.read(in), out);
        assertEquals(solution2, outBytes.toString());
        in.close();
        out.close();
    }

}
