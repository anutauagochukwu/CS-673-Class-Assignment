package Assignment_1;

//Ugochukwu Anuta
//Answer #6

import java.math.BigInteger;

public class FibonacciSeries {

    public static void main(String[] args){

        int last_nth_value = 100;

        System.out.println("The fibonacci of first" + last_nth_value);

        for(BigInteger value: iteration_fibonacci(last_nth_value))
            System.out.println(value);

    }

    static BigInteger[] iteration_fibonacci(int nth_value){

        //need a list to hold the value of each calculated fibonacci sequence
        BigInteger[] memoTable;
        memoTable = new BigInteger[nth_value];

        //the first fibonacci number are 1 and 1
        memoTable[0] = BigInteger.valueOf(1);
        memoTable[1] = BigInteger.valueOf(1);


        for(int count = 2; count < nth_value; count++)

            memoTable[count] = memoTable[count - 1].add(memoTable[count - 2]);

        return memoTable;

    }

}
