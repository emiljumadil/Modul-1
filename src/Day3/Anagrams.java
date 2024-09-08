package Day3;

import java.util.Arrays;

public class Anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase for consistent comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        {
            // Compare sorted arrays
            return Arrays.equals(charArray1, charArray2);
        }
    }

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Whether \"" + str1 + "\" and \"" + str2 + "\" is anagram? ");

        str1 = "hello";
        str2 = "world";
        System.out.println("Whwther \"" + str1 + "\" and \"" + str2 + "\" is anagram? ");
    }
}