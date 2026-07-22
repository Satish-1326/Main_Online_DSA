import java.util.Arrays;

public class Leetcode_1051_Height_Checker {
    public static void main(String[] args){
        int [] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int [] heights){
        int [] arr = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            arr[i] = heights[i];
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
