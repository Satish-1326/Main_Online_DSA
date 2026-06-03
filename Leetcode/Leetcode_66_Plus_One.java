public class Leetcode_66_Plus_One {
    public static void main(String[] args){
        int [] arr = {1,2,3};
        plusOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] plusOne(int [] arr){
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int [] result = new int[arr.length+1];
        result[0] = 1;
        return result;
    }
}

