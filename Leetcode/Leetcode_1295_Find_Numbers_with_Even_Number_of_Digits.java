public class Leetcode_1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args){
        int [] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int [] arr){
        int countResult = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            while(num != 0){
                int digit = num % 10;
                num = num / 10;
                count++;
            }
            if(count % 2 == 0){
                countResult++;
            }
        }
        return countResult;
    }
}
