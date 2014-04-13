package org.ninit.training.others;

public class InverseString {

    public static String reverseInPlace(String input) {
        char[] a = input.toCharArray();
        int medium = input.length() / 2;

        for (int i = 0; i < medium; i++) {
            char temp = a[i];
            a[i] = a[a.length - (1 + i)];
            a[a.length - (1 + i)] = temp;
        }

        return new String(a);
    }
}
