package Assignment_1;

//Ugochukwu Anuta
//Answer #5

import java.util.ArrayList;
import java.util.Arrays;

public class Combine_twoLists {

    public static void main (String[] args){

        String[] string_list = {"a", "b", "c"};
        Integer[] integer_list = {1,2,3};
        System.out.println(combine_into_One(string_list,integer_list));

    }

    static ArrayList<Object> combine_into_One(String[] A_list, Integer[] B_list){

        ArrayList<Integer> integer_list = new ArrayList<>(Arrays.asList(B_list));

        ArrayList<String> string_list = new ArrayList<>(Arrays.asList(A_list));


        ArrayList<Object> final_list = new ArrayList<>();

        for (int count = 0; count < integer_list.size(); count++ )
        {
            final_list.add(string_list.get(count));
            final_list.add(integer_list.get(count));

        }

        return final_list;
    }
}
