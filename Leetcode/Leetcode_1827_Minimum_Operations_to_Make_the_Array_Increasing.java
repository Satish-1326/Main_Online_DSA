public class Leetcode_1827_Minimum_Operations_to_Make_the_Array_Increasing {
    public static void main(String[] args){
        int [] arr = {1,5,2,4,1};
        int count = Solution1827(arr);
        System.out.println(count);
    }
    public static int Solution1827(int [] arr){
        int count = 0;
        int prev = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            if(curr <= prev){
                count += prev+1-curr;
                prev = prev+1;
            }else{
                prev = curr;
            }
        }
        return count;
    }
}
