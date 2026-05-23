public class Leetcode_1752_Check_if_Array_Is_Sorted_and_Rotated {
    public static void main(String[] args){
        int [] arr = {30,40,50,10,20};
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
        }
        if(count <= 1){
            System.out.println("Array is sorted and rotated...");
        }else{
            System.out.println("Array is not sorted or rotated...");
        }
    }
}
