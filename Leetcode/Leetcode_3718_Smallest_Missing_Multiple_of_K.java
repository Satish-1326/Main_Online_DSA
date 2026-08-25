import java.util.HashSet;

public class Leetcode_3718_Smallest_Missing_Multiple_of_K {
    public static void main(String[] args){
        int [] arr = {8,2,3,4,6};
        System.out.println(missingMultiple(arr,2));
    }
    public static int missingMultiple(int [] nums , int k){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int multiple = k;
        while(set.contains(multiple)){
            multiple += k;
        }
        return multiple;
    }
}
