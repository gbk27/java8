package programs;

import java.util.Stack;

public class ReverseString {

    String reverse = "";

    public static void main(String[] args) {

        String str = "Idea";
        ReverseString reverseString = new ReverseString();
        reverseString.reverseStringUsingStack(str);
        reverseString.reverseStringUsingLoop(str);

        System.out.println(reverseString.reverseStringUsingRecursive(str));
    }

    private static void reverseStringUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }


    private void reverseStringUsingLoop(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
        System.out.println();
    }


    private String reverseStringUsingRecursive(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            reverse += str.charAt(str.length() - 1) + reverseStringUsingRecursive(str.substring(0, str.length() - 1));
            return reverse;
        }

    }


}
