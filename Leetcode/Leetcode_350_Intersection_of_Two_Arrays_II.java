import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_350_Intersection_of_Two_Arrays_II {
    public static void main(String[] args){
        int [] nums1= {1,2,2,1};
        int [] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int [] intersect(int [] nums1 , int [] nums2){
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0 ; i < nums2.length; i++){
            al.add(nums2[i]);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < al.size(); j++) {
                if(nums1[i] == al.get(j)){
                    result.add(nums1[i]);
                    al.remove(j);
                    break;
                }
            }
        }

        int [] fi = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            fi[i] = result.get(i);
        }
        return fi;
    }
}
