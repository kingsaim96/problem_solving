package com.pattern.sliding.window;

/**
 * Note: A phrase, word or sequence is a palindrome that reads the same backwards as forwards.
 */
public class PalindromeCheck
{
    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;
        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left = left + 1;
            right = right - 1;
        }

        return true;
    }


    public static void main(String[] args)
    {
        System.out.println(PalindromeCheck.isPalindrome("DCBAABCD"));
    }
}


