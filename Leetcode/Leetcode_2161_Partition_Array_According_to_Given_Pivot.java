import java.util.ArrayList;

public class Leetcode_2161_Partition_Array_According_to_Given_Pivot {
    public static void main(String[] args){
        int [] arr = {-3,4,3,2};
        int pivot = 2;
        int [] result = Soltuion2161(arr , pivot);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }

    }
    public static int[] Soltuion2161(int [] arr , int pivot){
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>();
        ArrayList<Integer> main = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < pivot){
                small.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > pivot){
                big.add(arr[i]);
            }
        }

       for(int ele : small){
           main.add(ele);
       }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == pivot){
                main.add(arr[i]);
            }
        }
        for(int ele : big){
            main.add(ele);
        }

        int [] result = new int[main.size()];
        int k = 0;
        for(int ele : main){
            result[k] = ele;
            k++;
        }
        return result;
    }
}
