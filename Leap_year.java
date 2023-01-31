package Assignment_1;

//Ugochukwu Anuta
//Answer #7

import java.util.Scanner;

public class Leap_year {

    public static void main(String[] args){

        System.out.println("Enter a year to test if it is a leap year or not:");
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();
        boolean leap = test_leapYear(year);

        if(leap)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");

    }

    static boolean test_leapYear(int year){

        if(year % 4 == 0 ){

            //a leap year must be divisible by 4, 100 and 400
            return year % 100 == 0 && year % 400 == 0;
        }

       return false;
    }
}
