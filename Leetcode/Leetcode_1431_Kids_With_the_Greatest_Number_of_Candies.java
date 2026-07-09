import java.util.ArrayList;
import java.util.List;

public class Leetcode_1431_Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args){
        int [] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }
    public static List<Boolean> kidsWithCandies(int [] candies , int extraCandies){
        List<Boolean> ans = new ArrayList<>();

        int max = 0;
        for(int candi : candies){
            max = Math.max(candi , max);
        }

        for(int maxCandi : candies){
            ans.add(maxCandi + extraCandies >= max);
        }
        return ans;
    }
}
