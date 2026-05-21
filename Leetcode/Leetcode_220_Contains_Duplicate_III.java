public class Leetcode_220_Contains_Duplicate_III {
    public static void main(String[] args){
        int [] arr = {1,5,9,1,5,9};
        int valDiff = 3 ;
        int indexDiff = 2 ;

        boolean result = false;

        for(int i = 0 ; i < arr.length ; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if(Math.abs(i - j) <= indexDiff && Math.abs(arr[i] - arr[j]) <= valDiff){
                    result = true;
                }
            }
        }
        System.out.println(result);
    }
}

// NOT GET THE RESULT ON THE LEETCODE BECAUSE IT NEEDED SLIDING WINDOW APPROACH
// CURRENTLY I DON'T KNOW THE SLIDING WINDOW
// AFTER LEARNING IT I WILL SOLVE IT
