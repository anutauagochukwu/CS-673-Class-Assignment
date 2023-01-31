package Assignment_1;

//Ugochukwu Anuta
//Answer #4

import java.util.Scanner;

public class Test_palindrome {

    public static void main(String[] args){

        System.out.println("Enter a string to test if it's palindrome:");
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        boolean palindrome = (is_palindrome(text));

        if(palindrome)
            System.out.println('\n' + text + " is a palindrome!");
        else
            System.out.println('\n' + text + " is not a palindrome!");

    }

    private static boolean is_palindrome(String text){

        StringBuilder Reversed_text = new StringBuilder();

        for(int count = text.length() - 1;  count >= 0; count--){

            Reversed_text.append(text.charAt(count));
        }

        String reversed_text = Reversed_text.toString();

        for(int count = 0; count < text.length(); count++){

            if (text.charAt(count) != reversed_text.charAt(count))
                return false;
        }

        return true;
    }
}
