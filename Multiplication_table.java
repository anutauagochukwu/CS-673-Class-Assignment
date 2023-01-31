package Assignment_1;

//Ugochukwu Anuta
//Answer #3

public class Multiplication_table {

    public static void main(String[] args){

        for(int multiplier = 1; multiplier <= 12; multiplier++ ){

             System.out.println( "\n" + multiplier + " Times");

            for(int multiplicand = 0; multiplicand <= 12; multiplicand++ ){

                System.out.println( multiplicand + " * " + multiplier + " = " + (multiplicand*multiplier) );
            }

        }
    }

}
