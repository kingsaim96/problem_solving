package com.pattern.sliding.window;

/**
 * Note: A string like "Hello World" should be converted to "World Hello"
 */
public class ReverseWords
{
    public static void reverseWords(String s)
    {
        System.out.println("Input String: " + s);
        StringBuilder reversedString = new StringBuilder(s.length());
        for (int count = s.length() - 1; count >= 0; count--)
        {
            reversedString.append(s.charAt(count));
        }
        {
            System.out.println("Reversed String: " + reversedString);
        }

        s = reversedString.toString();
        int start = 0;
        int end = 0;
        StringBuilder reversedWords = new StringBuilder();
        while (end < s.length())
        {
            if (end == s.length() - 1 || s.charAt(end) == ' ')
            {
                int temp = end;
                while (end - 1 >= start)
                {
                    reversedWords.append(s.charAt(end - 1));
                    end = end - 1;
                }
                start = temp + 1;
                end = temp + 1;
                reversedWords.append(' ');
            }

            if (end >= s.length() - 1 || s.charAt(end) != ' ')
            {
                end = end + 1;
            }

        }
        System.out.println("Reversed Words String: " + reversedWords);

    }

    public static void main(String[] args)
    {
        ReverseWords.reverseWords("Hello World");
        //System.out.println();
    }
}


