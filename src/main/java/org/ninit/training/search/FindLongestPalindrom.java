package org.ninit.training.search;

public class FindLongestPalindrom {

    public static String getAllSubStrings(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = input.length() - 1; j > i; j--) {
                if (input.substring(i, j + 1).length() > result.length()
                        && isPalindrom(input.substring(i, j + 1))) {
                    result = input.substring(i, j + 1);
                }
            }
        }
        return result;
    }

    public static boolean isPalindrom(String input) {
        int medium =
                input.length() % 2 == 0 ? input.length() / 2
                        : input.length() / 2 - 1;
        for (int i = 0; i <= medium; i++) {
            if (input.charAt(i) != input.charAt(input.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(getAllSubStrings("repd abut tubas por"));
    }
}
