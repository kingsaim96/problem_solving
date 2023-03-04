package com.pattern.two.pointers;

/**
 * Note: A string like "Hello World" should be converted to "World Hello"
 */
public class ReverseWords {
    public static void reverseWords(String s) {
        System.out.println("Input String: " + s);

        StringBuilder reversedString = new StringBuilder();
        for (int count = s.length() - 1; count >= 0; count--) {
            reversedString.append(s.charAt(count));
        }
        System.out.println(reversedString);

        StringBuilder output = new StringBuilder();
        int start = 0;
        int end = 1;
        for (int count = 0; count < reversedString.length(); count++) {
            if (reversedString.charAt(count) == ' ' || count == reversedString.length() - 1) {
                for (int counter = end - 1; counter >= start; counter--) {
                    output.append(reversedString.charAt(counter));
                }
                start = end;
                end = start + 1;
                output.append(' ');
            } else {
                end = end + 1;
            }
        }
        System.out.println(output);

    }

    public static void main(String[] args) {
        ReverseWords.reverseWords("Hello World");
        //dlroW olleH
        //System.out.println();
    }
}


