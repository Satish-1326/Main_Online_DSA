public class Leetcode_1217_Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    public static void main(String[] args){
        int [] arr = {1,2,3};
        int result = Solution1217(arr);
        System.out.println(result);
    }
    public static int Solution1217(int [] arr){
        int even = 0;
        int odd = 0;

        for(int pos : arr){
            if(pos % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(even , odd);
    }
}
