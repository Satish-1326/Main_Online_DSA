import java.util.HashMap;

public class Leetcode_3289_The_Two_Sneaky_Numbers_of_Digitville {
    public static void main(String[] args) {
        int[] arr = {7,1,5,4,3,4,6,0,9,5,8,2};
        int[] result = Solution3289(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public static int[] Solution3289(int[] arr) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }
        int [] result = new int[2];
        int k = 0;
        for(int key : hm.keySet()){
            if(hm.get(key) == 2){
                result[k] = key;
                k++;
            }
        }
        return result;
    }
}
