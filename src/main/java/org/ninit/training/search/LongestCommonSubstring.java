package org.ninit.training.search;

public class LongestCommonSubstring {

    public static String findLongestCommonSubstring(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) {
            return "";
        }

        int maxLength = 0;
        int[][] table = new int[s1.length()][s2.length()];
        int endMaxSubstring = -1;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (i != 0 && j != 0) {
                        table[i][j] = table[i - 1][j - 1] + 1;
                    } else {
                        table[i][j] = 1;
                    }
                    if (table[i][j] > maxLength) {
                        maxLength = table[i][j];
                        endMaxSubstring = i;
                    }
                }
            }
        }
        return s1.substring(1 + (endMaxSubstring - maxLength),
                endMaxSubstring + 1);
    }
}
