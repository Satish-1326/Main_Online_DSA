import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode_2913_Subarrays_Distinct_Element_Sum_of_Squares_I {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(1);

        System.out.println(sumCounts(al));
    }
    public static int sumCounts(List<Integer> nums){
        int ans = 0;

        for (int i = 0; i < nums.size(); i++) {
            HashSet<Integer> hm = new HashSet<>();
            for (int j = i; j < nums.size(); j++) {
                hm.add(nums.get(j));
                int count = hm.size();

                ans += count*count;
            }
        }
        return ans;
    }
}
