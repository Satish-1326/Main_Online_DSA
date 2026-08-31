import java.util.HashSet;
import java.util.Set;

public class Leetcode_Count_Integers_Appearing_in_a_Single_Block {
    public static void main(String[] args){
        int [] nums = {1,2,2,1};
        System.out.println(countSpecialIntegers(nums));
    }
    public static int countSpecialIntegers(int [] nums){
        Set<Integer> seen = new HashSet<>();
        Set<Integer> notSpecial = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if(i == 0 || nums[i] != nums[i - 1]){

                if(seen.contains(nums[i])) {
                    notSpecial.add(nums[i]);
                }
                seen.add(nums[i]);
            }
        }
        return seen.size() - notSpecial.size();
    }
}
