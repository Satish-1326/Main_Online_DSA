import java.util.ArrayList;
import java.util.Collections;

public class Leetcode_2553_Separate_the_Digits_in_an_Array {
    public static void main(String[] args){
        int [] arr = {13,25,83,77};
        ArrayList<Integer>al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
           int element = arr[i];

           ArrayList<Integer> temp = new ArrayList<>();

           while(element != 0){
               int digit = element%10;
               temp.add(digit);
               element = element/10;
           }
            Collections.reverse(temp);
           al.addAll(temp);
        }
        int [] arrResult = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arrResult[i] = al.get(i);
        }

        for (int i = 0; i < arrResult.length; i++) {
            System.out.print(arrResult[i]+" ");
        }
    }
}

