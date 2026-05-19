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

class Leetcode_2540_Minimum_Common_Value_two_poi{
    public static void main(String[] args){
        int [] arr = {1,2,3};
        int [] arr2 = {2,4};

        int i = 0 ;
        int j = 0;
        while (i < arr.length && j < arr2.length){
            if(arr[i] == arr2[j]){
                System.out.println(arr[i]);
            }
            if(arr[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
    }
}
