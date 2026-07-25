public class Leetcode_2798_Number_of_Employee_Who_Met_the_Target {
    public static void main(String[] args){
        int [] arr = {0,1,2,3,4};
        System.out.println(numberOfEmployeesWhoMetTarget(arr,2));
    }
    public static int numberOfEmployeesWhoMetTarget(int [] arr , int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= target){
                count++;
            }
        }
        return count;
    }
}
