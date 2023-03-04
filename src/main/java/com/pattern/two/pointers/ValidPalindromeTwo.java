package com.pattern.two.pointers;

/**
 * Note: Write a function that takes a string as input and checks whether it can be a
 * valid palindrome by removing at most one character from it
 */
public class ValidPalindromeTwo {

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                //check by removing from the end
                return isValidPalindrome(s, start, end - 1)
                        || isValidPalindrome(s, start + 1, end);
            }
            start = start + 1;
            end = end - 1;
        }
        return true;
    }

    public static boolean isValidPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start = start + 1;
            end = end - 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {
                "madam",
                "madame",
                "dead",
                "abca",
                "tebbem",
                "eeccccbebaeeabebccceea",
                "ognfjhgbjhzkqhzadmgqbwqsktzqwjexqvzjsopolnmvnymbbzoofzbbmynvmnloposjzvqxejwqztksqwbqgmdazhqkzhjbghjfno"
        };
        for (String testCase : testCases) {
            System.out.println(ValidPalindromeTwo.isPalindrome(testCase));
        }
    }
}


