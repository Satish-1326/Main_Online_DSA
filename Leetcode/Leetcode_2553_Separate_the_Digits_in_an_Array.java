import java.util.ArrayList;

public class Leetcode_2553_Separate_the_Digits_in_an_Array {
    public static void main(String[] args){
        int [] arr = {13,25,83,77};
        ArrayList<Integer>al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int reverse = 0;
            int element = arr[i];
            while (element != 0){
                int digit = element % 10;
                reverse = reverse * 10 + digit;
                al.add(reverse);
                element = element / 10;
            }
        }
        System.out.println(al);
    }
}

