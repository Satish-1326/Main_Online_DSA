public class Leetcode_2540_Minimum_Common_Value {
    public static void main(String[] args){
        int [] arr1 = {1,2,3};
        int [] arr2 = {2,4};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    if(arr1[i] < min){
                        min = arr1[i];
                    }
                }
            }
        }
        System.out.println(min);
    }
}
