public class Leetcode_1464_Maximum_Product_of_Two_Elements_in_an_Array {
    public static void main(String[] args){
        int [] arr = {3,4,5,2};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int [] arr){
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if((arr[i] - 1)* (arr[j] - 1) > max){
                    max = (arr[i]-1)*(arr[j] - 1);
                }
            }
        }
        return max;
    }
}
