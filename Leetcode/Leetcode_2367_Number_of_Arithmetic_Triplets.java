import java.util.ArrayList;

public class Leetcode_2367_Number_of_Arithmetic_Triplets {
    public static void main(String[] args){
        int [] arr = {4,5,6,7,8,9};
        int result = Solution2367(arr , 2);
        System.out.println(result);
    }
    public static int Solution2367(int [] arr , int diff){
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            al.clear();
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[j] - arr[i] == diff && arr[k] - arr[j] == diff){
                        al.add(arr[i]);
                        al.add(arr[j]);
                        al.add(arr[k]);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
