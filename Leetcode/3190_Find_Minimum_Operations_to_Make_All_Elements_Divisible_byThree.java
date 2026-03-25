class Demo4{
    public static void main(String[]args){
        int [] nums = {1,2,3,4};

        Solution3190 solution3190 = new Solution3190();
        int result= solution3190.minimumOperation(nums);
        System.out.print("Total operation to ake divisible by 3 : "+result);
    }
}
class Solution3190{
    public int minimumOperation(int [] nums){
        int result = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            int temp = nums[i];
            if(temp % 3 != 0){
                temp++;
                result++;
            }
        }
        return result;
    }
}

/*
* OUTPUT :
*
* Total operation to ake divisible by 3 : 3
*
* */