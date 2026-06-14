import java.util.HashSet;

public class Leetcode_128_Longest_Consecutive_Sequence {
    public static void main(String[] args){
        int [] arr = {100,4,200,1,3,2};
        int result = Solution128(arr);
        System.out.println(result);
    }
    public static int Solution128(int [] arr){
        int longest = 0;

        HashSet<Integer>set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum+1)){
                    currentNum++;
                    currentLength++;
                }
                longest = Math.max(longest , currentLength);
            }
        }
        return longest;
    }
}
